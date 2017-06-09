package day1

import com.doctorq.day1.User

/**
  * Created by doctorq on 2017/6/9.
  */
object Test {
  def main(args: Array[String]): Unit = {
    println("Hello,World!")
    val usr1 = new User
    println("=====")
    val point1 = new Point()
    println(point1.x)
    println(point1.y)
    point1.x = 99
    point1.y = 101
    println(point1.x)
    println(point1.y)

    println("=====")



    println(point1.x)
    println(point1)

    val origin = new Point2
    //第一个参数赋值为1，第二个参数使用默认值
    val point2 = new Point2(1)
    println(point2.x)

    val point3 = new Point2(y = 2)

    println(point3.y)
  }
}
