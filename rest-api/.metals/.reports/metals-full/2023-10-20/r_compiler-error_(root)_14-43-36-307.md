file://<WORKSPACE>/app/models/Post.scala
### scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)

occurred in the presentation compiler.

action parameters:
offset: 788
uri: file://<WORKSPACE>/app/models/Post.scala
text:
```scala
package models

import play.api.libs.json.OFormat
import play.api.libs.json.Json
import play.api.libs.json.OWrites
import play.api.libs.json.JsResult
import play.api.libs.json.JsValue
import play.api.libs.json.JsObject
import reactivemongo.bson.BSONObjectID
import reactivemongo.bson.BSONDocumentReader
import reactivemongo.bson.BSONDocument

case class Post(
    val id: Option[BSONObjectID],
    val title: String,
    val content: String
)

object Post {
  // implicit val fmt: Format[Post] = Json.format[Post]
  implicit object PostBSONReader extends BSONDocumentReader[Post] {
    def read(doc: BSONDocument): Post = {
      Post(
        doc.getAs[BSONObjectID]("_id"),
        doc.getAs[String]("title").get,
        doc.getAs[String]("content").get
      )
    }
  }

  implicit o@@
}

```



#### Error stacktrace:

```
scala.tools.nsc.typechecker.Unapplies.constrParamss(Unapplies.scala:90)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth(Unapplies.scala:141)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth$(Unapplies.scala:138)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.factoryMeth(MetalsGlobal.scala:67)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper(MethodSynthesis.scala:238)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper$(MethodSynthesis.scala:237)
	scala.tools.nsc.typechecker.Namers$Namer.enterImplicitWrapper(Namers.scala:58)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym(Global.scala:95)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym$(Global.scala:81)
	scala.tools.nsc.interactive.InteractiveAnalyzer$$anon$2.enterExistingSym(Global.scala:51)
	scala.tools.nsc.typechecker.Namers$Namer.standardEnterSym(Namers.scala:314)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym(AnalyzerPlugins.scala:496)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym$(AnalyzerPlugins.scala:495)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.pluginsEnterSym(MetalsGlobal.scala:67)
	scala.tools.nsc.typechecker.Namers$Namer.enterSym(Namers.scala:288)
	scala.tools.nsc.typechecker.Typers$Typer.enterSym(Typers.scala:2010)
	scala.tools.nsc.typechecker.Typers$Typer.enterSyms(Typers.scala:2005)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2065)
	scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:1965)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6061)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6231)
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

scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)