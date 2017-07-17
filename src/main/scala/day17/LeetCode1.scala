package day17

import day14.Utils

/**
  * Created by doctorq on 2017/7/10.
  * two sum: https://leetcode.com/problems/two-sum/#/description
  */
object TwoSum extends Utils with App {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val result = new Array[Int](2)
    var temp = nums


    for (i <- 0 until nums.length) {
      for (j <- i + 1 until nums.length) {
        if (target - nums(i) == nums(j)) {
          result(0) = i
          result(1) = j
          return result
        }
      }
    }
    result
  }

  val array = Array(3, 2, 4)
  val resultArray = twoSum(array, 6)

  printlnArray(resultArray)
}
