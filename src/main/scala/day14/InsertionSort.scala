package day14


/**
  * Created by doctorq on 2017/6/26.
  * 直接插入排序,首先以a[0]作为一个有序数组，然后依次插入a[1]~a[n-1]
  * 时间复杂度:n平方
  */
object InsertionSort extends App with Utils {

  /**
    *
    * 普通模式,时间复杂度O(n2)
    *
    * @param list
    * @return
    */
  def sort(list: Array[Int]): Array[Int] = {
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


  val list = Array(15, 4, 3, 23, 5, 6, 7, 34, 6, 7, 3, 5, 7, 8, 3, 4, 6, 8, 3, 5, 7)
  printlnArray(list.sorted)
  printlnArray(sort(list))
}
