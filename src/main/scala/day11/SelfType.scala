package day11

/**
  * Created by doctorq on 2017/6/12.
  * 自类型
  */
object SelfType extends App {

  val realBeyonce = new VerifiedTweeter("Beyonce")
  realBeyonce.tweet("Just spilled my glass of lemonade")

}


trait User {
  def username: String
}

trait Tweeter {

  this: User =>

  def tweet(tweetText: String) = println(s"$username: $tweetText")
}

class VerifiedTweeter(val username_ : String) extends User with Tweeter {
  override def username: String = s"real $username_"
}
