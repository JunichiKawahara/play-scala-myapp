package controllers

import akka.util._
import javax.inject._
import play.api._
import play.api.http._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(p: Option[Int]) = Action {
    val arr: List[String] = List(
      "Yamada Taro",
      "Tanaka Hanako",
      "Ogawa Sachiko"
    )
    Ok(views.html.index(
      "これはコントローラーで用意したメッセージです。",
      arr
    ))
  }

}
