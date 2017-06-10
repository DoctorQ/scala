package day3

/**
  * Created by doctorq on 2017/6/10.
  * 高阶函数
  */
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString + right
}


object FunTest extends App {
  def apply(f: Int => String, v: Int) = f(v)

  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 7))
}
