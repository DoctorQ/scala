package day17

import day14.Utils

/**
  * Created by doctorq on 2017/7/10.
  * https://leetcode.com/problems/add-two-numbers/#/description
  */
object LeetCode2 extends Utils with App {
  //  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
  //
  //  }

  def createNode(digit: Int): ListNode = {
    var temp = digit
    val value = temp % 10
    val root = new ListNode(value)
    temp /= 10
    var tempNode = root
    while (temp > 0) {
      tempNode.next = new ListNode(temp % 10)
      tempNode = tempNode.next
      temp /= 10
    }
    root
  }


  val num1 = 342
  val num2 = 465
  val l1 = createNode(num1)
  val l2 = createNode(num2)

  println("debug")

}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}


