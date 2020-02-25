package controllers

import akka.util._
import javax.inject._
import play.api._
import play.api.http._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(p: Option[Int]) = Action {
    val arr: List[List[String]] = List(
      List("Yamada Taro", "taro@yamada", "999-999"),
      List("Tanaka Hanako", "hanako@flower", "888-888"),
      List("Ogawa Sachiko", "sachico@happy", "777-777")
    )
    Ok(views.html.index(
      "これはコントローラーで用意したメッセージです。",
      arr, List("Name", "Mail", "Tel")
    ))
  }

}
