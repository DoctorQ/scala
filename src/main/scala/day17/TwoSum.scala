package day17

import day14.{QuickSort, Utils}

/**
  * Created by doctorq on 2017/7/10.
  * two sum: https://leetcode.com/problems/two-sum/#/description
  */
object TwoSum extends Utils with App {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val sortNums = QuickSort.sort(nums)
    var start = 0
    var end = nums.length - 1
    while (start < end) {
      val left = sortNums(start)
      val right = sortNums(end)
      if (left + right == target) {
        return Array(nums.indexOf(left), nums.indexOf(right))
      } else if (left + right < target) {
        start += 1
      } else {
        end -= 1
      }
    }

    Array(-1, -1)
  }

  val array = Array(3, 2, 4)
  val resultArray = twoSum(array, 6)

  printlnArray(resultArray)
}
