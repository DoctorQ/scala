package day14

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/19.
  * 快排
  * 时间复杂度:nlogn
  */
object QuickSort extends App with Utils {


  def sort(data: Array[Int]): Array[Int] = {
    if (data.isEmpty || data.size == 1) return data
    val flag = data.head
    //过滤得到小于等于基准值的数据
    val left = sort(for (item <- data.tail if item <= flag) yield item)
    //过滤得到大于基准值的数据
    val right = sort(for (item <- data.tail if item > flag) yield item)
    //递归排序左右两侧的元素
    val result = new ArrayBuffer[Int]()
    result.appendAll(left)
    result.append(flag)
    result.appendAll(right)
    result.toArray
  }

  val list = Array[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34)

  val sortedList = sort(list)

  printlnArray(sortedList)

}
