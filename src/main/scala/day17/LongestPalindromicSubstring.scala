package day17

/**
  * https://leetcode.com/problems/longest-palindromic-substring/#/description
  */
object LongestPalindromicSubstring {


  def longestPalindrome(s: String): String = {
    if (s.length <= 1) return s
    var start = 0
    var end = 0
    for (i <- 0 until s.length) {
      val len1 = getPlindromeLength(s, i, i)
      val len2 = getPlindromeLength(s, i, i + 1)
      val len = Math.max(len1, len2)
      if (len > end - start) {
        end = i + len / 2
        start = i - (len - 1) / 2
      }

    }
    s.substring(start, end + 1)
  }

  /**
    * 获取回文大小
    *
    * @param s
    * @param left
    * @param right
    * @return
    */
  def getPlindromeLength(s: String, left: Int, right: Int): Int = {
    var L = left
    var R = right
    while (L >= 0 && R < s.length && s.charAt(L) == s.charAt(R)) {
      L -= 1
      R += 1
    }
    R - L - 1
  }

  def main(args: Array[String]): Unit = {
    println(longestPalindrome("abcda"))
  }

}
