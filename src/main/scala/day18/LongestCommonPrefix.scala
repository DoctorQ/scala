package day18

/**
  * https://leetcode.com/problems/longest-common-prefix/description/
  */
object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.length == 0) return ""
    val flag = strs(0)
    if (flag.length == 0) return ""
    var index = 0
    var fl = true
    for (i <- 0 until flag.length if fl) {
      for (j <- 1 until strs.length if fl) {
        if (strs(j).length < i + 1 || strs(j)(i) != flag(i)) {
          fl = false
        }
      }
      if (fl)
        index = i + 1
    }
    flag.substring(0, index)
  }

  def main(args: Array[String]): Unit = {
    val array = Array[String]("")
    val result = longestCommonPrefix(array)
    println(result)
  }

}
