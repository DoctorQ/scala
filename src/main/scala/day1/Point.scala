package day1

/**
  * Created by doctorq on 2017/6/9.
  */
class Point() {

  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x

  //x_指代x的setter
  def x_=(newValue: Int): Unit = {
    if (newValue < bound) _x = newValue
  }

  def y = _y
  //y_指代y的setter
  def y_=(newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x $y)"
}

/**
  * 可选参数
  *
  * @param x
  * @param y
  */
class Point2(val x: Int = 0, val y: Int = 0)
