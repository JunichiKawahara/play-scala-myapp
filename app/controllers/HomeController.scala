package controllers

import akka.util._
import javax.inject._
import play.api._
import play.api.http._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = Action {
    Ok(views.html.index(
      "これはコントローラーで用意したメッセージです。"
    ))
  }

  def form() = Action { request =>
    val form: Option[Map[String, Seq[String]]] = request.body.asFormUrlEncoded
    val param: Map[String, Seq[String]] = form.getOrElse(Map())
    val name: String = param.get("name").get(0)
    val password: String = param.get("pass").get(0)
    Ok(views.html.index(
      "name: " + name + ", password: " + password
    ))
  }
}
