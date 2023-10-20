package models

import play.api.libs.json.Format
import play.api.libs.json.Json
import reactivemongo.bson.BSONDocument
import reactivemongo.bson.BSONDocumentReader
import reactivemongo.bson.BSONDocumentWriter
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json._
import play.api.libs.json.OWrites

case class Post(
    val _id: Option[BSONObjectID],
    val title: String,
    val content: String
)

object Post {
  implicit val fmt: Format[Post] = Json.format[Post]
  implicit object PostBSONReader extends BSONDocumentReader[Post] {
    def read(doc: BSONDocument): Post = {
      Post(
        doc.getAs[BSONObjectID]("_id"),
        doc.getAs[String]("title").get,
        doc.getAs[String]("content").get
      )
    }
  }

  implicit object PostBSONWriter extends BSONDocumentWriter[Post] {
    def write(post: Post): BSONDocument = {
      BSONDocument(
        "_id" -> post._id,
        "title" -> post.title,
        "content" -> post.content
      )
    }
  }
}
