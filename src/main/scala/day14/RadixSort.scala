package day14

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/29.
  * 基数排序
  */
object RadixSort extends Utils with App {

  /*
    获取数组中最大值
   */
  def max(unSort: Array[Int]): Int = {
    if (unSort.size < 1) throw new IllegalArgumentException
    var temp = unSort(0)
    for (i <- 1 until unSort.size) {
      if (unSort(i) > temp) {
        temp = unSort(i)
      }
    }

    temp
  }

  /**
    * 获取数字的位数
    *
    * @param item
    * @return
    */
  def getDigit(item: Int): Int = {
    var digit = 1
    var temp = item / 10
    while (temp > 0) {
      digit += 1
      temp /= 10
    }
    digit
  }

  /**
    * 获取数字在第index位上的值，123第二位的值2，第一位为3，第三位为1
    *
    * @param item
    * @param index
    * @return
    */
  def getNum(item: Int, index: Int): Int = {
    if (index < 1) throw new IllegalArgumentException
    //超出,自动补0
    if (getDigit(item) < index) return 0
    val itemStr = item.toString
    itemStr.charAt(itemStr.size - index).toString.toInt
  }


  def generate(num: Int): Array[ArrayBuffer[Int]] = {
    val bucket = new Array[ArrayBuffer[Int]](10)
    for (i <- 0 until num) {
      val temp = new ArrayBuffer[Int]()
      bucket(i) = temp
    }
    bucket
  }

  /**
    * 平铺二维数组到一维
    *
    * @param bucketArray
    * @return
    */
  def flatten(bucketArray: Array[ArrayBuffer[Int]], size: Int): Array[Int] = {
    val temp = new Array[Int](size)
    var index = 0
    for (i <- 0 until bucketArray.size) {
      if (bucketArray(i).size != 0) {
        for (j <- 0 until bucketArray(i).size if (bucketArray(i)(j) >= 0)) {
          temp(index) = bucketArray(i)(j)
          index += 1
        }
      }
    }
    temp
  }

  /**
    *
    * @param unSort 原始数组
    * @param digit  最大数的位数
    * @return 已排序好的数组
    */
  def sort(unSort: Array[Int], digit: Int): Array[Int] = {


    var tempUnSort = unSort
    for (i <- 1 to digit) {
      val bucket = generate(10)
      for (j <- 0 until tempUnSort.size) {
        val index = getNum(tempUnSort(j), i)
        bucket(index).append(tempUnSort(j))
      }

      tempUnSort = flatten(bucket, tempUnSort.size)
    }

    tempUnSort
  }

  val array = Array[Int](1, 45, 23, 0, 23, 234, 23, 5, 6, 7, 9, 9, 9, 456)
  val digit = getDigit(max(array))
  printlnArray(sort(array, digit))


}
