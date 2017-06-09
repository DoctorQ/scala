package day1

/**
  * Created by doctorq on 2017/6/9.
  */
class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x $y)"
}
