package day17

/**
  * https://leetcode.com/problems/string-to-integer-atoi/tabs/description
  */
object ATOI {

  def myAtoi(str: String): Int = {
    if (str.length == 0) return 0
    var result: Double = 0
    //1代表正数,0代表负数
    var sign = 1
    var j = 0
    while (j < str.length && str.charAt(j) == ' ') {
      j += 1
    }
    if (str.charAt(j) == '+') {
      j += 1
    } else if (str.charAt(j) == '-') {
      sign = -1
      j += 1
    }
    var flag = true
    for (i <- j until str.length if (flag)) {
      val ch = str.charAt(i)
      if (ch >= '0' && ch <= '9') {
        result = result * 10 + (ch - '0').toInt
      } else {
        println(s"${ch}非数字字符")
        flag = false
      }
    }
    result *= sign
    if (result > Integer.MAX_VALUE) Integer.MAX_VALUE else if (result < Integer.MIN_VALUE) Integer.MIN_VALUE else {
      result.toInt
    }
  } 

  def main(args: Array[String]): Unit = {
    val s = "  -0012a42"
    println(myAtoi(s))

  }

}
