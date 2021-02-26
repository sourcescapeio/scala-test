import sbt._

object Dependencies {
  object Vsn {
    val Scala = "2.13.5"

    val Play = "2.8.1"
    val PlaySlick = "5.0.0"
    val PostgresSlick = "0.19.0"

    val Akka = "2.5.31"
    val AkkaHttp = "10.1.11"
    val Alpakka = "2.0.0-RC2"

    val TestContainersScala = "0.39.1"
  }

  object Core {
    val akkaStreams = "com.typesafe.akka" %% "akka-stream" % Vsn.Akka
    val akkaHttp = "com.typesafe.akka" %% "akka-http" % Vsn.AkkaHttp
    val akkaSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % Vsn.AkkaHttp
  }

  object Persist {
    val playSlick = "com.typesafe.play" %% "play-slick" % Vsn.PlaySlick
    val postgresSlick = "com.github.tminglei" %% "slick-pg" % Vsn.PostgresSlick
    val postgresSlickJson = "com.github.tminglei" %% "slick-pg_play-json" % Vsn.PostgresSlick
  }

  object Misc {
    val scalaz = "org.scalaz" %% "scalaz-core" % "7.2.30"
  }

  object TestDeps {
    val scalaTestPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
    val testContainers = "com.dimafeng" %% "testcontainers-scala-scalatest" % Vsn.TestContainersScala % Test
    val testContainersPostgres = "com.dimafeng" %% "testcontainers-scala-postgresql" % Vsn.TestContainersScala % Test
    val testContainersElasticSearch = "com.dimafeng" %% "testcontainers-scala-elasticsearch" % Vsn.TestContainersScala % Test
  }
}
