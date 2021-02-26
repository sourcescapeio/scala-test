package test

import play.api.test._
import play.api.test.Helpers._
import play.api.Logger

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class ApplicationSpec extends MangosteenTest {

  "Config" should {
    "get config" in {
      println {
        app.configuration.get[String]("play.http.secret.key")
      }
    }
  }

  "Routes" should {

    "send 404 on a bad request" in {
      route(app, FakeRequest(GET, "/boum")).map(status(_)) mustBe Some(NOT_FOUND)
    }

  }

  "HealthController" should {
    "display health" in {
      val healthCheck = route(app, FakeRequest(GET, "/health")).get

      status(healthCheck) mustBe OK
      println(contentAsString(healthCheck))
    }
  }
}
