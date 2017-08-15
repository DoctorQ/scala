package day18

import scala.collection.mutable.ArrayBuffer

/*
https://leetcode.com/problems/container-with-most-water/description/
 */

object ContainerWithMostWater {
  def maxArea(height: Array[Int]): Int = {
    if (height.length <= 1) return 0
    var left = 0
    var right = height.length - 1
    var max = 0
    while (left < right) {
      var volume = 0
      if (height(left) <= height(right)) {
        volume = (right - left) * height(left)
        left += 1
      } else {
        volume = (right - left) * height(right)
        right -= 1
      }
      if (max < volume) max = volume
    }
    max
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1, 1)
    val result = maxArea(array)
    println(result)

  }

}
