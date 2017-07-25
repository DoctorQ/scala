package day17

/**
  * https://leetcode.com/problems/zigzag-conversion/#/description
  */
object LeetCode6 {
  def convert(s: String, numRows: Int): String = {
    if (numRows < 2) return s
    val length = s.length
    var result = ""
    //周期
    val r = 2 * numRows - 2
    for (i <- 0 until numRows) {
      var j = i
      while (j < length) {
        result += s.charAt(j)
        //非首尾行要进行追加
        if (i > 0 && i < numRows - 1 && (j + r - 2 * i) < length) {
          result += s.charAt(j + r - 2 * i)
        }
        j += r
      }
    }
    result
  }


  def main(args: Array[String]): Unit = {
    val s = "PAYPALISHIRING"
    println(convert(s, 3))
  }
}
