file://<WORKSPACE>/build.sbt
### file%3A%2F%2F%2Fhome%2Fkristiyan%2FDocuments%2FHTW%2F5FS%2FPS%2FHTW_STA_WISE23-24%2Frest-api%2Fbuild.sbt:18: error: ; expected but string constant found
+= libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.0.0"
                          ^

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/build.sbt
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.JUnitXmlReportPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._, _root_.play.sbt.Play.autoImport._, _root_.play.sbt.PlayService.autoImport._, _root_.play.sbt.routes.RoutesCompiler.autoImport._, _root_.giter8.ScaffoldPlugin.autoImport._, _root_.play.twirl.sbt.SbtTwirl.autoImport._, _root_.com.typesafe.sbt.SbtNativePackager.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.JavaAppPackaging.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.JavaServerAppPackaging.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.jar.ClasspathJarPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.jar.LauncherJarPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.jlink.JlinkPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.scripts.BashStartScriptPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.scripts.BatStartScriptPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemdPlugin.autoImport._, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemloaderPlugin.autoImport._, _root_.com.typesafe.sbt.packager.debian.DebianPlugin.autoImport._, _root_.com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._, _root_.com.typesafe.sbt.packager.graalvmnativeimage.GraalVMNativeImagePlugin.autoImport._, _root_.com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin.autoImport._, _root_.com.typesafe.sbt.packager.linux.LinuxPlugin.autoImport._, _root_.com.typesafe.sbt.packager.rpm.RpmPlugin.autoImport._, _root_.com.typesafe.sbt.packager.universal.UniversalPlugin.autoImport._, _root_.com.typesafe.sbt.packager.windows.WindowsPlugin.autoImport._, _root_.com.typesafe.sbt.web.SbtWeb.autoImport._, _root_.com.typesafe.sbt.jse.SbtJsEngine.autoImport._, _root_.com.typesafe.sbt.jse.SbtJsTask.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin, _root_.play.sbt.Play, _root_.play.sbt.PlayAkkaHttp2Support, _root_.play.sbt.PlayAkkaHttpServer, _root_.play.sbt.PlayFilters, _root_.play.sbt.PlayJava, _root_.play.sbt.PlayLayoutPlugin, _root_.play.sbt.PlayLogback, _root_.play.sbt.PlayMinimalJava, _root_.play.sbt.PlayNettyServer, _root_.play.sbt.PlayScala, _root_.play.sbt.PlayService, _root_.play.sbt.PlayWeb, _root_.play.sbt.routes.RoutesCompiler, _root_.giter8.ScaffoldPlugin, _root_.play.twirl.sbt.SbtTwirl, _root_.com.typesafe.sbt.SbtNativePackager, _root_.com.typesafe.sbt.packager.archetypes.JavaAppPackaging, _root_.com.typesafe.sbt.packager.archetypes.JavaServerAppPackaging, _root_.com.typesafe.sbt.packager.archetypes.jar.ClasspathJarPlugin, _root_.com.typesafe.sbt.packager.archetypes.jar.LauncherJarPlugin, _root_.com.typesafe.sbt.packager.archetypes.jlink.JlinkPlugin, _root_.com.typesafe.sbt.packager.archetypes.scripts.AshScriptPlugin, _root_.com.typesafe.sbt.packager.archetypes.scripts.BashStartScriptPlugin, _root_.com.typesafe.sbt.packager.archetypes.scripts.BatStartScriptPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemVPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemdPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.SystemloaderPlugin, _root_.com.typesafe.sbt.packager.archetypes.systemloader.UpstartPlugin, _root_.com.typesafe.sbt.packager.debian.DebianDeployPlugin, _root_.com.typesafe.sbt.packager.debian.DebianPlugin, _root_.com.typesafe.sbt.packager.debian.JDebPackaging, _root_.com.typesafe.sbt.packager.docker.DockerPlugin, _root_.com.typesafe.sbt.packager.docker.DockerSpotifyClientPlugin, _root_.com.typesafe.sbt.packager.graalvmnativeimage.GraalVMNativeImagePlugin, _root_.com.typesafe.sbt.packager.jdkpackager.JDKPackagerDeployPlugin, _root_.com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin, _root_.com.typesafe.sbt.packager.linux.LinuxPlugin, _root_.com.typesafe.sbt.packager.rpm.RpmDeployPlugin, _root_.com.typesafe.sbt.packager.rpm.RpmPlugin, _root_.com.typesafe.sbt.packager.universal.UniversalDeployPlugin, _root_.com.typesafe.sbt.packager.universal.UniversalPlugin, _root_.com.typesafe.sbt.packager.windows.WindowsDeployPlugin, _root_.com.typesafe.sbt.packager.windows.WindowsPlugin, _root_.com.typesafe.sbt.web.SbtWeb, _root_.com.typesafe.sbt.jse.SbtJsEngine, _root_.com.typesafe.sbt.jse.SbtJsTask
name := """ps-sta-ws23"""
organization := "de.htw-berlin"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0-RC2" % Test
+= libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.0.0"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "de.htw-berlin.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "de.htw-berlin.binders._"

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.syntaxErrorExpected(ScalametaParser.scala:421)
	scala.meta.internal.parsers.ScalametaParser.expect(ScalametaParser.scala:423)
	scala.meta.internal.parsers.ScalametaParser.accept(ScalametaParser.scala:427)
	scala.meta.internal.parsers.ScalametaParser.acceptStatSep(ScalametaParser.scala:447)
	scala.meta.internal.parsers.ScalametaParser.acceptStatSepOpt(ScalametaParser.scala:451)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4462)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$13(ScalametaParser.scala:4696)
	scala.Option.getOrElse(Option.scala:189)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4696)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4652)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4650)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:135)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:132)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:59)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:356)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fkristiyan%2FDocuments%2FHTW%2F5FS%2FPS%2FHTW_STA_WISE23-24%2Frest-api%2Fbuild.sbt:18: error: ; expected but string constant found
+= libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.0.0"
                          ^