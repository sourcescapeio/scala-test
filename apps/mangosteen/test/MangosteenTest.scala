package test

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._
import play.api.inject.guice._
import play.api.Logger
import javax.inject.{ Inject, Singleton }
import play.api.inject.bind

trait MangosteenTest extends PlaySpec with GuiceOneAppPerSuite {
  override def fakeApplication() = {

    new GuiceApplicationBuilder()
      .configure(
        "blah" -> "test")
      .build()
  }
}