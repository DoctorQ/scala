package day14


/**
  * Created by doctorq on 2017/6/26.
  * 直接插入排序,首先以a[0]作为一个有序数组，然后依次插入a[1]~a[n-1]
  */
object StraightInsertionSort extends App {

  /**
    *
    * 普通模式,时间复杂度O(n)
    *
    * @param list
    * @return
    */
  def sortN2(list: Array[Int]): Array[Int] = {
    val size = list.size
    if (size <= 1) return list
    //从小到大排序
    for (i <- 1 until size) {
      if (list(i) < list(i - 1)) {
        var j = i
        while (j >= 1 && list(j) < list(j - 1)) {
          swap(list, j - 1, j)
          j -= 1
        }
      }
    }
    list
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


  def printlnList(sortedHeap: Array[Int]): Unit = {
    sortedHeap.foreach(item => print(s"$item "))
    println("sorted!")
  }

  val list = Array(15, 4, 3, 23, 5, 6, 7, 34, 6, 7, 3, 5, 7, 8, 3, 4, 6, 8, 3, 5, 7)
  printlnList(list.sorted)
  printlnList(sortN2(list))
}
