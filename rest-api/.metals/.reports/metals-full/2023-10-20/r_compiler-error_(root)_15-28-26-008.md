file://<WORKSPACE>/app/repository/PostRepository.scala
### java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)

occurred in the presentation compiler.

action parameters:
offset: 807
uri: file://<WORKSPACE>/app/repository/PostRepository.scala
text:
```scala
package repository

import javax.inject.{Inject, Singleton}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.bson.collection.BSONCollection
import scala.concurrent.{ExecutionContext, Future}
import models.Post
import reactivemongo.bson.{BSONDocument, BSONObjectID}
import reactivemongo.api.ReadPreference
import reactivemongo.api.Cursor
// import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.json.{JsObject, Json}

@Singleton
class PostRepository @Inject() (implicit
    ec: ExecutionContext,
    reactiveMongoApi: ReactiveMongoApi
) {

  def collection: Future[BSONCollection] =
    reactiveMongoApi.database.map(db => db.collection("posts"))

  def findAll(limit: Int = 50): Future[Seq[Post]] = {
    collection.flatMap(
      _.find(BSONDocument(), Op@@)
      )
    // collection.flatMap(
    //   _.find(Json.obj(), Option.empty[JsObject])
    //     .cursor[Post](ReadPreference.Primary)
    //     .collect[Seq](limit, Cursor.FailOnError())
    // )
  }

  def findOne(id: BSONObjectID): Future[Option[Post]] = {
    collection.flatMap(
      _.find(BSONDocument("_id" -> id), Option.empty[Post]).one[Post]
    )
  }
}

```



#### Error stacktrace:

```
scala.collection.mutable.ArrayBuffer.apply(ArrayBuffer.scala:106)
	scala.reflect.internal.Types$Type.findMemberInternal$1(Types.scala:1030)
	scala.reflect.internal.Types$Type.findMember(Types.scala:1035)
	scala.reflect.internal.Types$Type.memberBasedOnName(Types.scala:661)
	scala.reflect.internal.Types$Type.member(Types.scala:625)
	scala.tools.nsc.typechecker.Namers$Namer.checkNotRedundant$1(Namers.scala:561)
	scala.tools.nsc.typechecker.Namers$Namer.checkSelector$1(Namers.scala:594)
	scala.tools.nsc.typechecker.Namers$Namer.$anonfun$checkSelectors$4(Namers.scala:597)
	scala.tools.nsc.typechecker.Namers$Namer.checkSelectors(Namers.scala:597)
	scala.tools.nsc.typechecker.Namers$Namer.scala$tools$nsc$typechecker$Namers$Namer$$importSig(Namers.scala:1882)
	scala.tools.nsc.typechecker.Namers$Namer$ImportTypeCompleter.completeImpl(Namers.scala:910)
	scala.tools.nsc.typechecker.Namers$LockingTypeCompleter.complete(Namers.scala:2123)
	scala.tools.nsc.typechecker.Namers$LockingTypeCompleter.complete$(Namers.scala:2121)
	scala.tools.nsc.typechecker.Namers$TypeCompleterBase.complete(Namers.scala:2116)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1565)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1537)
	scala.reflect.internal.Symbols$Symbol.initialize(Symbols.scala:1726)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:3311)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5743)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6063)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:124)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:480)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1370)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1363)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:680)
	scala.tools.nsc.interactive.Global.typedTreeAt(Global.scala:829)
	scala.tools.nsc.interactive.Global.completionsAt(Global.scala:1233)
	scala.meta.internal.pc.CompletionProvider.safeCompletionsAt(CompletionProvider.scala:449)
	scala.meta.internal.pc.CompletionProvider.completions(CompletionProvider.scala:58)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$complete$1(ScalaPresentationCompiler.scala:169)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)