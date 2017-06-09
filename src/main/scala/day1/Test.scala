package day1

import com.doctorq.day1.User

/**
  * Created by doctorq on 2017/6/9.
  */
object Test {
  def main(args: Array[String]): Unit = {
    println("Hello,World!")

    val usr1 = new User

    val point1 = new Point(2, 3)
    println(point1.x)
    println(point1)
  }
}
