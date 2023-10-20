package repository

import models.Post
import play.api.libs.json.JsObject
import play.api.libs.json.Json
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.Cursor
import reactivemongo.api.ReadPreference
import reactivemongo.api.bson.collection.BSONCollection
import reactivemongo.bson.BSONDocument
import reactivemongo.bson.BSONObjectID

import javax.inject.Inject
import javax.inject.Singleton
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import reactivemongo.api.commands.WriteResult

@Singleton
class PostRepository @Inject() (implicit
    ec: ExecutionContext,
    reactiveMongoApi: ReactiveMongoApi
) {

  def collection: Future[BSONCollection] =
    reactiveMongoApi.database.map(db => db.collection("posts"))

  def findAll(limit: Int = 50): Future[Seq[Post]] = {
    collection.flatMap(
      _.find(BSONDocument(), Option.empty[Post])
        .cursor[Post](ReadPreference.Primary)
        .collect[Seq](limit, Cursor.FailOnError[Seq[Post]]())
    )
  }

  def findOne(id: BSONObjectID): Future[Option[Post]] = {
    collection.flatMap(
      _.find(BSONDocument("_id" -> id), Option.empty[Post]).one[Post]
    )
  }

  def add(post: Post): Future[WriteResult] = {
    collection.flatMap(
      _.insert(ordered = false)
        .one(post)
    )
  }
}
