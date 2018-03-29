package controllers

import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.test.{FakeHeaders, FakeRequest}
import play.api.test.Helpers._

class HelloControllerSpec extends PlaySpec with GuiceOneAppPerSuite {

  "An index action" should {
    "return 200" in {
      val Some(hello) = route(app, FakeRequest(
        method = GET,
        path = "/hello",
      ))
      status(hello) mustEqual OK
    }
  }

}
