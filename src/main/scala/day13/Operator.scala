package day13

/**
  * Created by doctorq on 2017/6/13.
  * scala中的操作符
  */

case class Vec(val x: Double, val y: Double) {
  def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
}

case class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this

  def or(that: MyBool): MyBool = if (x) this else that

  def negate: MyBool = MyBool(!x)

  def not(x: MyBool) = x.negate

  def xor(x: MyBool, y: MyBool) = (x or y) and not(x and y)
}

object Operator extends App {

  val vector1 = Vec(1.0, 1.0)

  val vector2 = Vec(2.0, 2.0)

  val vector3 = vector1 + vector2

  println(vector3.x)
  println(vector3.y)

}
