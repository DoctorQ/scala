package day17

/**
  * https://leetcode.com/problems/longest-palindromic-substring/#/description
  */
object LeetCode5 {

  def longestPalindrome(s: String): String = {
    if (s.length <= 1) return s
    var max = ""
    for (i <- 0 until s.length) {
      for (j <- i until s.length) {
        val tempStr = s.substring(i, j + 1)
        if (tempStr.length > max.length && isPalindrome(tempStr)) {
          max = tempStr
        }
      }
    }
    max
  }

  def isPalindrome(s: String): Boolean = {
    var i = 0
    while (i < s.length / 2) {
      if (s.charAt(i) != s.charAt(s.length - 1 - i)) {
        return false
      }
      i += 1
    }
    true
  }

  def main(args: Array[String]): Unit = {
    println(longestPalindrome("abcda"))
  }

}
