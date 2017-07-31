package day17

import day14.Utils

/**
  * Created by doctorq on 2017/7/10.
  * https://leetcode.com/problems/add-two-numbers/#/description
  */
object LeetCode2 extends Utils with App {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var firstNode = l1
    var secondNode = l2
    val resultNode: ListNode = new ListNode(0)
    var temp: ListNode = resultNode
    var carry = 0
    while (firstNode != null || secondNode != null) {
      val firstVal = if (firstNode == null) 0 else firstNode._x
      val secondVal = if (secondNode == null) 0 else secondNode._x
      val addNum = carry + firstVal + secondVal
      carry = addNum / 10
      temp.next = new ListNode(addNum % 10)
      temp = temp.next
      firstNode = if (firstNode != null) firstNode.next else firstNode
      secondNode = if (secondNode != null) secondNode.next else secondNode
    }
    if (carry > 0) {
      temp.next = new ListNode(carry)
    }
    resultNode.next
  }

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


  val num1 = 1
  val num2 = 99
  val l1 = createNode(num1)
  val l2 = createNode(num2)
  val result = addTwoNumbers(l1, l2)

  var resultNode = result
  while (resultNode != null) {
    println(resultNode._x)
    resultNode = resultNode.next
  }

}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}


