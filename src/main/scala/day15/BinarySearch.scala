package day15

import day14.Utils

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/19.
  * 二分查找
  */
object BinarySearch extends Utils with App {


  def sort(unSorted: Array[Int], find: Int): Unit = {
    val size = unSorted.size
    if (size == 0) {
      println(s"${find} no find")
      return
    }

    printlnArray(unSorted)
    val flag = unSorted(size / 2)

    if (find == flag) {
      println(s"find ${size / 2}")
      return
    } else if (find > flag) {
      val right = subArray(unSorted, size / 2 + 1, size - 1)
      sort(right, find)
    } else {
      val left = subArray(unSorted, 0, size / 2 - 1)
      sort(left, find)
    }
  }

  def subArray(parent: Array[Int], start: Int, end: Int): Array[Int] = {
    val subArray = new ArrayBuffer[Int]()
    for (i <- start to end) {
      subArray.append(parent(i))
    }
    subArray.toArray
  }

  val list = Array(1, 3, 4, 2, 5, 5, 6, 9, 3, 4, 4)

  sort(list.sorted, 9)

}
