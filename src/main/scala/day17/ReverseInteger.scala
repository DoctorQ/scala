package day17

/**
  * 数字反转：https://leetcode.com/problems/reverse-integer/tabs/description
  */
object ReverseInteger {

  def reverse(x: Int): Int = {
    var result: Double = 0
    var a = if (x < 0) -1 else 1
    var temp = Math.abs(x)
    while (temp > 0) {
      result = result * 10 + temp % 10
      temp = temp / 10
    }
    result *= a
    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) 0 else {
      result.toInt
    }
  }

  def main(args: Array[String]): Unit = {
    val x = 1534236469
    println(Integer.MAX_VALUE)
    println(reverse(x))
  }

}
