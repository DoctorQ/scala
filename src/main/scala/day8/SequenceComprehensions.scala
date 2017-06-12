package day8

/**
  * Created by doctorq on 2017/6/12.
  * 序列解读
  */
class SequenceComprehensions {

}


case class User(val name: String, val age: Int)

object SequenceComprehensionsTest {
  def foo(n: Int, v: Int) = {
    for (i <- 0 until n; j <- i until n if i + j == v)
      yield (i, j)
  }

  def main(args: Array[String]): Unit = {
    val userBase = List(new User("doctorq1", 28),
      new User("doctorq2", 33),
      new User("doctorq3", 23)
    )

    val twentySomethings = for (user <- userBase if (user.age >= 20 && user.age < 30))
      yield user.name

    twentySomethings.foreach(name => println(s"$name "))

    foo(10, 10) foreach {
      case (i, j) => println(s"($i, $j)")
    }
  }
}