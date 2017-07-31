package day17

/**
  * https://leetcode.com/problems/palindrome-number/description/
  * 题意不增加额外空间:只能比较最高位和最低位是否相等
  */
object PalindromeNumber {

  def isPalindrome(x: Int): Boolean = {
    //负数肯定不是回文数
    if (x < 0) return false
    //0-9为回文数
    if (x < 10) return true
    var digits = 0
    var a = x
    while (a != 0) {
      a /= 10
      digits += 1
    }
    println(s"数字有${digits}位")
    var left = Math.pow(10, digits - 1).toInt
    var right = 1
    while (left > right) {
      if (x / left % 10 != x / right % 10) return false
      left /= 10
      right *= 10
    }
    true
  }

  def main(args: Array[String]): Unit = {
    val s = 11
    println(isPalindrome(s))
  }

}
