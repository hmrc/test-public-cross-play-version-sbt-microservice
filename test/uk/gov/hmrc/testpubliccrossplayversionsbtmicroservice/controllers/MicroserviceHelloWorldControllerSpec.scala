package uk.gov.hmrc.testpubliccrossplayversionsbtmicroservice.controllers

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.http.Status
import play.api.test.FakeRequest
import play.api.test.Helpers._

import scala.concurrent.ExecutionContext.Implicits.global

class MicroserviceHelloWorldControllerSpec extends WordSpec with Matchers with GuiceOneAppPerSuite {

  val fakeRequest = FakeRequest("GET", "/")

  "GET /" should {
    "return 200" in {
      val controller = new MicroserviceHelloWorld()
      val result = controller.hello()(fakeRequest)
      status(result) shouldBe Status.OK
    }
  }

}
