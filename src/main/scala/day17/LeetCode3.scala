package day17

import day14.Utils

import scala.collection.mutable.ArrayBuffer

/**
  * https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
  */
object LeetCode3 extends App with Utils {


  def lengthOfLongestSubstring(s: String): Int = {
    if (s.length <= 1) return s.length
    var start = 0
    var end = 1
    var index = 1
    var max = ""

    def getMax: Unit = {
      if (max.length < s.substring(start, end).length) max = s.substring(start, end)
    }

    while (index < s.length) {
      val ch = s.charAt(index)
      val beforeSub = s.substring(start, end)
      if (beforeSub.contains(ch)) {
        getMax
        val temp = beforeSub.indexOf(ch)
        start = start + temp + 1
        end += 1
      } else {
        end = index + 1
        getMax
      }
      index += 1
    }
    max.length
  }


  val s = "abcabcbb"
  val s1 = "bbbbb"
  val s2 = "pwwkew"
  val s3 = "b"
  val s4 = "au"
  val s5 = "aab"


  println(lengthOfLongestSubstring(s))
  println(lengthOfLongestSubstring(s1))
  println(lengthOfLongestSubstring(s2))
  println(lengthOfLongestSubstring(s3))

  println(lengthOfLongestSubstring(s4))
  println(lengthOfLongestSubstring(s5))

}
