file://<WORKSPACE>/app/controllers/PostController.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic inheritance involving trait Manifest

occurred in the presentation compiler.

action parameters:
offset: 1143
uri: file://<WORKSPACE>/app/controllers/PostController.scala
text:
```scala
package controllers

import models.Post
import play.api.libs.json.Json
import play.api.mvc.AbstractController
import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.ControllerComponents
import play.api.mvc.Request
import repository.PostRepository

import javax.inject.Inject
import scala.concurrent.ExecutionContext
import reactivemongo.bson.BSONObjectID
import scala.util.Success
import scala.util.Failure

class PostController @Inject() (implicit
    executionContext: ExecutionContext,
    cc: ControllerComponents,
    repository: PostRepository
) extends AbstractController(cc) {

  def getAll(): Action[AnyContent] = Action.async {
    implicit request: Request[AnyContent] =>
      repository.findAll().map { posts =>
        Ok(Json.toJson(posts))
      }
  }

  def getOne(id: String): Action[AnyContent] = Action.async {
    implicit request: Request[AnyContent] =>
      val objIdTry = BSONObjectID.parse(id)
      objIdTry match {
        case Success(objectId) =>
          repository.findOne(objectId).map { post =>
            Ok(Json.toJson(post))
          }
        case Failure(_) => 
          Future@@
      }
  }
}

```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic inheritance involving trait Manifest