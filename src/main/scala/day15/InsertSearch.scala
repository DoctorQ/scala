package day15


import day14.Utils
import day15.BinarySearch.printlnArray

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/30.
  * 插值查找：改进二分查找的算法,在数值范围比较大，分布比较均匀时可以采用插值查找来取代二分查找
  * 切分的索引值不再是之前的中间位置，根据待查找的数值的权重来计算切分的索引值
  */
object InsertSearch extends App with Utils {
  def search(unSorted: Array[Int], find: Int): Unit = {
    val size = unSorted.size
    if (size == 0) {
      println(s"${find} no find")
      return
    }
    printlnArray(unSorted)
    val index =
      (size - 1) * (find - unSorted(0)) / (unSorted(size - 1) - unSorted(0))

    val flag = unSorted(index)

    if (find == flag) {
      println(s"find ${index}")
      return
    } else if (find > flag) {
      val right = subArray(unSorted, index + 1, size - 1)
      search(right, find)
    } else {
      val left = subArray(unSorted, 0, index - 1)
      search(left, find)
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

  search(list.sorted, 3)

}
