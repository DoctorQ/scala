package day4

/**
  * Created by doctorq on 2017/6/10.
  * 模式匹配
  */
object PatternMatching extends App {

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  println(matchTest(3)) // many
  println(matchTest(1)) // one

}

