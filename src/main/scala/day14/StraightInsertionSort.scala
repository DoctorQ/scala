package day14


import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/26.
  * 直接插入排序,首先以a[0]作为一个有序数组，然后依次插入a[1]~a[n-1]
  */
object StraightInsertionSort extends App {

  /**
    *
    * 普通模式,时间复杂度O(n2)
    *
    * @param list
    * @return
    */
  def sortN2(list: Array[Int]): Array[Int] = {
    val size = list.size
    if (size <= 1) return list
    //从小到大
    val sortedArray = new Array[Int](size)
    sortedArray(0) = list(0)

    import scala.util.control.Breaks._

    for (i <- 1 until size) {
      val currentItem = list(i)
      if (currentItem > sortedArray(i - 1)) {
        //唯一不需要后移的是当前数大于已排序队列的最后一个数
        sortedArray(i) = currentItem
      } else {
        breakable {
          for (j <- 0 until i) {
            if (sortedArray(j) > currentItem) {
              //j位置后面(包括j)的元素全部后移一位
              val temp = sortedArray.clone()
              for (k <- j until i) {
                sortedArray(k + 1) = temp(k)
              }
              //j位置填充a[i]
              sortedArray(j) = currentItem
              break()
            }
          }
        }
      }
    }
    sortedArray
  }


  def sortN(list: Array[Int]): Unit = {

  }

  def printlnList(sortedHeap: Array[Int]): Unit = {
    sortedHeap.foreach(item => print(s"$item "))
    println("sorted!")
  }

  val list = Array(15, 4, 3, 23, 5, 6, 7, 34, 6, 7, 3, 5, 7, 8, 3, 4, 6, 8, 3, 5, 7)
  printlnList(list.sorted)
  printlnList(sortN2(list))
}
