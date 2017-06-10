package day3

/**
  * Created by doctorq on 2017/6/10.
  */
class NestedMethods {
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {

      if (x <= 1) accumulator else fact(x - 1, x * accumulator)
    }

    fact(x, 1)

  }

}

object NestedMethodsTest extends App {

  val nest = new NestedMethods
  println("Factorial of 2: " + nest.factorial(2))
  println("Factorial of 2: " + nest.factorial(3))
}
