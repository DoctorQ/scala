package day17

/**
  * https://leetcode.com/problemset/algorithms/
  */
object RegularExpressionMatching {

  def isMatch(s: String, p: String): Boolean = {
    //如果s为空,判断p是否为空
    if (p.isEmpty) return s.isEmpty
    //如果p为一个字符,s也为1个字符,且s==p或者p为.。结果也是true
    if (p.size == 1) return (s.size == 1 && (s(0) == p(0) || p(0) == '.'))
    //如果p的第二个字符不是"*",可能取.或实际字符
    if (p(1) != '*') {
      if (s.isEmpty) return false
      return (s(0) == p(0) || p(0) == '.') && isMatch(s.substring(1), p.substring(1))
    }
    // 第二个字符为"*"
    var tempS = s
    while (!tempS.isEmpty && (tempS(0) == p(0) || p(0) == '.')) {
      if (isMatch(tempS, p.substring(2))) return true
      tempS = tempS.substring(1)
    }
    isMatch(tempS, p.substring(2))
  }

  def main(args: Array[String]): Unit = {
    println(isMatch("aa","a")) //false
    println(isMatch("aa","aa")) // true
    println(isMatch("aaa","aa")) // false
    println(isMatch("aa", "a*")) // true
    println(isMatch("aa", ".*")) // true
    println(isMatch("ab", ".*")) // true
    println(isMatch("aab","c*a*b")) // true
    println(isMatch("aab",".*aab")) // true
  }

}
