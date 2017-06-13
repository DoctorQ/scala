package day12

/**
  * Created by doctorq on 2017/6/13.
  */

case class MyPair[A, B](x: A, y: B)

object LocalTypeInference extends App {
  val x = 1 + 2 * 3
  val y = x.toString()

  def succ(x: Int) = x + 1

  //  def fac(n: Int) = if (n == 0) else n * fac(n - 1)

  def id[T](x: T) = x

  val p = MyPair(1, "scala")
  val q = id(1)

  var obj = null

  //  obj = new Object

}
