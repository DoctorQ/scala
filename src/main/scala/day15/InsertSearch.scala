package day15

import day14.Utils

/**
  * Created by doctorq on 2017/6/30.
  * 插值查找：改进二分查找的算法,在数值范围比较大，分布比较均匀时可以采用插值查找来取代二分查找
  * 切分的索引值不再是之前的中间位置，根据待查找的数值的权重来计算切分的索引值
  */
object InsertSearch extends App with Utils {
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
      val index = start + (end - start) * (find - unSorted(start)) / (unSorted(end) - unSorted(start))
      if (unSorted(index) > find) {
        end = index - 1
      } else if (unSorted(index) < find) {
        start = index + 1
      } else {
        println(s"${find} find in index: ${index} ")
        return
      }
    }
    println(s"${find} no found")
  }


  val list = Array(1, 3, 4, 2, 5, 5, 6, 9, 3, 4, 4)

  search(list.sorted, 3)

}
