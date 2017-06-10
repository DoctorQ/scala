package day5

/**
  * Created by doctorq on 2017/6/10.
  */
object Day5Test extends App {
  val s: String = "doctorq"

  var d: String = "test"

  SingletonObject.sum(List(12, 3, 45))
}

class X {

  import X._

  def blah = foo
}

object X {
  private def foo = 42
}


