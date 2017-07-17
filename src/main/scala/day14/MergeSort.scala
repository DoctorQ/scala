package day14

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/26.
  * 归并排序,nlogn
  */
object MergeSort extends App with Utils {
  /**
    * 2个有序数组合并，O(n)时间复杂度
    *
    * @param left
    * @param right
    * @return
    */
  def mergeArray(left: ArrayBuffer[Int], right: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    val sortedArray = new ArrayBuffer[Int]()

    while (left.size != 0 && right.size != 0) {
      val leftItem = left.head
      val rightItem = right.head
      if (leftItem < rightItem) {
        sortedArray.append(leftItem)
        left.remove(0)
      } else {
        sortedArray.append(rightItem)
        right.remove(0)
      }
    }
    if (left.size != 0) {
      sortedArray.appendAll(left)
    } else if (right.size != 0) {
      sortedArray.appendAll(right)
    }

    sortedArray
  }


  def mergeSort(list: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    if (list.size <= 1) return list
    var left = ArrayBuffer[Int]()
    var right = ArrayBuffer[Int]()
    val size = list.size
    for (i <- 0 until size) {
      if (i < size / 2) {
        left.append(list(i))
      } else {
        right.append(list(i))
      }
    }

    left = mergeSort(left)
    right = mergeSort(right)
    mergeArray(left, right)
  }



  val list = ArrayBuffer(15, 4, 3, 23, 5, 6, 7, 34, 6, 7, 3, 5, 7, 8, 3, 4, 6, 8, 3, 5, 7)

  val sortedList = mergeSort(list)

  printlnArrayBuffer(sortedList)
}
