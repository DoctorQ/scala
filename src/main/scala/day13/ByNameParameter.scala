package day13

/**
  * Created by doctorq on 2017/6/13.
  * 传名参数
  */
object ByNameParameter extends App {
  def calculate(input: => Int) = input * 37

  @deprecated
  def whileLoop(condition: => Boolean)(body: => Unit): Unit = {
    println(condition)
    if (condition) {
      body
      whileLoop(condition)(body)
    }


  }

  var i = 5
  whileLoop(i > 0) {
    println(i)
    i -= 1
  }
}
