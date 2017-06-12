package day12

/**
  * Created by doctorq on 2017/6/12.
  * 隐式参数
  */
object ImplicitParameter extends App {


  def bigger[T](a: T, b: T)(implicit ordered: T => Ordered[T])
  = if (ordered(a) > b) a else b


  println(bigger(3, 4))
  println(bigger("yy", "xx"))
}


abstract class SemiGroup[A] {
  def add(x: A, y: A): A

}

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}

object ImplicitTest extends App {

  implicit object StringMonoid extends Monoid[String] {
    override def unit: String = ""

    override def add(x: String, y: String): String = x concat y

  }

  implicit object IntMonoid extends Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y

    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))


  println(sum(List(1, 2, 3))) // uses IntMonoid implicitly
  println(sum(List("a", "b", "c"))) // uses StringMonoid implicitly


}
