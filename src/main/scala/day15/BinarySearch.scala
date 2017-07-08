package day15

import day14.Utils

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/19.
  * 二分查找
  */
object BinarySearch extends Utils with App {

  /**
    * 迭代实现
    *
    * @param unSorted
    * @param find
    */
  def search(unSorted: Array[Int], find: Int): Unit = {
    val size = unSorted.size
    if (size == 0) {
      println(s"empty array")
      return
    }

    printlnArray(unSorted)
    var start = 0
    var end = size - 1
    while (start <= end) {
      val index = (start + end) / 2
      if (unSorted(index) > find) {
        end = index - 1
      } else if (unSorted(index) < find) {
        start = index + 1
      } else {
        println(s"${find} in index : ${index}")
        return
      }
    }

    println(s"${find} no found")
  }

  val list = Array(1, 3, 4, 2, 5, 5, 6, 9, 3, 4, 4)

  search(list.sorted, 8)

}
