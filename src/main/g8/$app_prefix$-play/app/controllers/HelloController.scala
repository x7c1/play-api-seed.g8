package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import $organization$.$app_prefix$.domain.Greeting

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { request: Request[AnyContent] =>
    val message = Greeting messageFor "$name$"
    Ok(message)
  }
}
