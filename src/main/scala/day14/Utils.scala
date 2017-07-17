package day14

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/28.
  */
trait Utils {

  def printlnArrayBuffer(sortedHeap: ArrayBuffer[Int]): Unit = {
    sortedHeap.foreach(item => print(s"$item "))
    println("sorted!")

  }

  def printlnArray(sortedHeap: Array[Int]): Unit = {
    sortedHeap.foreach(item => print(s"$item "))
    println("sorted!")
  }

  def printlnList(sortedHeap: List[Int]): Unit = {
    sortedHeap.foreach(item => print(s"$item "))
    println("sorted!")
  }

  /**
    * 将left和right两个位置的数互换
    *
    * @param list
    * @param left
    * @param right
    */
  def swap(list: Array[Int], left: Int, right: Int): Unit = {
    val temp = list(left)
    list(left) = list(right)
    list(right) = temp
  }


}
