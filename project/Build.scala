import sbt._
import scala.util.Properties.envOrNone
import Keys._
import com.typesafe.sbt.SbtScalariform._
import scalariform.formatter.preferences._

object APIBuild {

  import Dependencies._

  val libDependencies = Seq(
    Core.akkaHttp,
    Core.akkaSprayJson,
    Core.akkaStreams,
    play.sbt.PlayImport.ws,
    play.sbt.PlayImport.guice,    
    Misc.scalaz
  )

  val appDependencies = Seq(
    play.sbt.PlayImport.evolutions,
    play.sbt.PlayImport.jdbc,
    Persist.playSlick,
    Persist.postgresSlick,
    Persist.postgresSlickJson,
    //
    TestDeps.scalaTestPlay,
    TestDeps.testContainers,    
  )

  val pluginSettings = Scalariform.settings

  val baseSettings = Seq(
    sources in (Compile,doc) := Seq.empty,
    publishArtifact in (Compile, packageDoc) := false,
    scalaVersion := Vsn.Scala,
    scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-encoding", "utf8")
  ) ++ pluginSettings

  val appSettings = baseSettings ++ Seq(
    libraryDependencies ++= appDependencies
  )

  val libSettings = baseSettings ++ Seq(
    libraryDependencies ++= libDependencies
  )

}
