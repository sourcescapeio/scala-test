package controllers

import javax.inject._
import mangosteen.API
import scala.concurrent.ExecutionContext

@Singleton
class HealthController @Inject() ()(implicit ec: ExecutionContext) extends API {

  def health() = {
    api { implicit request =>
      "Healthy"
    }
  }
}
