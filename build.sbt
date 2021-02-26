import Dependencies._

version := "1.0-SNAPSHOT"

/**
  * Libraries
  */
lazy val lychee = Project("lychee", file("modules/lychee")).
  settings(APIBuild.libSettings: _*)

/**
 * Applications
 */
lazy val mangosteen = (project in file("apps/mangosteen")).
  enablePlugins(PlayScala).
  settings(APIBuild.appSettings: _*).
  settings(
    name := "mangosteen",
    parallelExecution in Test := false
  ).
  dependsOn(lychee)
