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


  }
}
