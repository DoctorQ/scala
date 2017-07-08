package day15

import day14.Utils

/**
  * Created by doctorq on 2017/6/30.
  * 斐波那契查找
  */
object FbonacciSearch extends App with Utils {

  /**
    *
    * 创建指定长度的Fbonacci数组
    *
    * @param length
    * @return
    */
  def createFbonacci(length: Int): Array[Int] = {
    if (length < 3) Array[Int]()
    val array = new Array[Int](length)
    array(0) = 1
    array(1) = 1
    val first = 1
    val second = 1

    for (i <- 2 until length) {
      array(i) = array(i - 1) + array(i - 2)
    }
    array
  }

  /**
    * 迭代的方式
    *
    * @param unSort
    * @param find
    * @return
    */
  def search(unSort: Array[Int], find: Int): Int = {
    //获取fbonacci数组下标
    val fbonacciArray = createFbonacci(20)
    printlnArray(fbonacciArray)

    var k = 0
    while (unSort.length > fbonacciArray(k) - 1) {
      k += 1
    }
    val length = fbonacciArray(k) - 1
    println(s"new array's length : ${length}")


    val newArray = new Array[Int](length)

    for (i <- 0 until unSort.length) {
      newArray(i) = unSort(i)
    }

    for (i <- unSort.length until length) {
      newArray(i) = unSort(unSort.length - 1)
    }


    var start = 0
    var high = unSort.length - 1
    while (start <= high) {
      val index = start + fbonacciArray(k - 1) - 1
      if (newArray(index) > find) {
        high = index - 1
        k -= 1
        //搜索前半部分，f(k-1)子数组
      } else if (newArray(index) < find) {
        //搜索后半部分,f(k-2)子数组
        start = index + 1
        k -= 2
      } else {
        println(s"find it!")
        if (index < high) {
          return index
        } else {
          return high
        }
      }
    }
    return -1
  }


  val array = Array[Int](2, 4, 5, 63, 5, 6, 2, 3, 89, 34, 34, 7, 8)
  println(s"待查找数组大小为: ${array.length}")
  printlnArray(array.sorted)
  val result = search(array.sorted, 89)

  println(s"find ${result}")
}
