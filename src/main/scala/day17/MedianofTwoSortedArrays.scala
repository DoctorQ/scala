package day17

import day14.Utils

/**
  * https://leetcode.com/problems/median-of-two-sorted-arrays/#/description
  */
object MedianofTwoSortedArrays extends Utils {
  /**
    * 2个有序数组合并为一个:如果为基数,中间数为所求。如果是偶数，中间2个数取平均值
    *
    * @param nums1
    * @param nums2
    * @return
    */
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val n = nums1.length
    val m = nums2.length
    var i = 0
    var j = 0
    var index = 0
    val result = new Array[Int](m + n)
    while (i < n && j < m) {
      if (nums1(i) <= nums2(j)) {
        result(index) = nums1(i)
        i += 1
      } else {
        result(index) = nums2(j)
        j += 1
      }
      index += 1
    }

    if (i < n) {
      //nums1有余
      while (i < n) {
        result(index) = nums1(i)
        index += 1
        i += 1
      }
    } else if (j < m) {
      //nums2有余
      while (j < m) {
        result(index) = nums2(j)
        index += 1
        j += 1
      }
    }
    if ((m + n) % 2 == 0) {
      //偶数
      val middle = (m + n) / 2
      (result(middle) + result(middle - 1)).toDouble / 2
    } else {
      //奇数
      result((m + n) / 2).toDouble
    }
  }

  def main(args: Array[String]): Unit = {
    val nums1 = Array[Int](1, 2)
    val nums2 = Array[Int](3)
    println(findMedianSortedArrays(nums1, nums2))

  }

}
