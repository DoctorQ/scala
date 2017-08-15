package day18

/**
  * https://leetcode.com/problems/integer-to-roman/description/
  */
object IntegerToRoman {
  def romanToInt(s: String): Int = {
    if (s.length == 0) return 0
    var ret: Int = toNumber(s(0))
    for (i <- 1 until s.length) {
      if (toNumber(s(i - 1)) < toNumber(s(i))) {
        ret += toNumber(s(i)) - 2 * (toNumber(s(i - 1)))
      } else {
        ret += toNumber(s(i))
      }
    }
    ret
  }

  def toNumber(ch: Char): Int = {
    val result: Int = ch match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }
    result
  }

  def intToRoman(num: Int): String = {
    val roman: Array[Array[String]] = new Array[Array[String]](4)
    //0-9
    roman(0) = Array[String]("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    //0,10,20-90
    roman(1) = Array[String]("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    //0-900
    roman(2) = Array[String]("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    //1000,2000,3000
    roman(3) = Array[String]("", "M", "MM", "MMM")
    var ret = ""
    var digit = 0
    var temp = num
    while (temp != 0) {
      val remain = temp % 10
      ret = roman(digit)(remain) + ret
      digit += 1
      temp /= 10
    }
    ret
  }

  def main(args: Array[String]): Unit = {
    val s = 143
    val result1 = intToRoman(s)
    println(result1)
    println(romanToInt(result1))
  }


}
