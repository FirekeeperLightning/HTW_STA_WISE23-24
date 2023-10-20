package controllers

import models.Post
import play.api.libs.json.Json
import play.api.mvc.AbstractController
import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.ControllerComponents
import play.api.mvc.Request
import reactivemongo.bson.BSONObjectID
import repository.PostRepository

import javax.inject.Inject
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success
import play.api.libs.json.JsValue

/**
  * REST API for the database
  * @param executionContext
  * @param cc
  * @param repository MongoDB access
  */
class PostController @Inject() (implicit
    executionContext: ExecutionContext,
    cc: ControllerComponents,
    repository: PostRepository
) extends AbstractController(cc) {

  /**
    * retrieves all posts from the database
    * @return Action request handler
    */
  def getAll(): Action[AnyContent] = Action.async {
    implicit request: Request[AnyContent] =>
      repository.findAll().map { posts =>
        Ok(Json.toJson(posts))
      }
  }
  
  /**
    * retrieve a post by it's id from the database
    * @param id: String id provided by mongodb
    * @return Action request handler
    */
  def getPostById(id: String): Action[AnyContent] = Action.async {
    implicit request: Request[AnyContent] =>
      val objIdTry = BSONObjectID.parse(id)
      objIdTry match {
        case Success(objectId) =>
          repository.findOne(objectId).map { post =>
            Ok(Json.toJson(post))
          }
        case Failure(_) =>
          Future.successful(BadRequest("Cannot parse the id"))
      }
  }

  /** adds a post to the database a post should look like: { "title": "some
    * title", "content": "some content" }
    * @return Action request handler with the created object
    */
  def create(): Action[JsValue] =
    Action.async(controllerComponents.parsers.json) { implicit request =>
      {
        request.body
          .validate[Post]
          .fold(
            _ => Future.successful(BadRequest("Cannot parse body")),
            post =>
              repository.add(post).map { _ =>
                Created(Json.toJson(post))
              }
          )
      }
    }

  // TODO update and delete functions
}
