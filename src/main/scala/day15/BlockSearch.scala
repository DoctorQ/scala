package day15

import day14.Utils

/**
  * Created by doctorq on 2017/6/30.
  * 分块查找：适用于表结构动态变化的场景，比顺序查找快，但不如折半查找
  * 表索引有序，值无需有序
  */
object BlockSearch extends App with Utils {

  /**
    * 获取索引表
    *
    * @param search
    * @param sizePerBlock 每个块的数据最大个数
    * @return
    */
  def getIndexArray(search: Array[Int], sizePerBlock: Int): Array[Int] = {
    val blockSize = search.length / sizePerBlock + 1
    //    println(s"分成${blockSize}块")
    //索引表,顺序的
    val indexArray = new Array[Int](blockSize)
    var i = sizePerBlock - 1
    var j = 0
    while (i < array.length) {
      if (i > array.length - 1) {
        indexArray(j) = array(array.length - 1)
      } else {
        indexArray(j) = array(i)
      }
      j += 1
      i += sizePerBlock
    }
    indexArray
  }

  /**
    *
    * @param search       待查找表
    * @param sizePerBlock 每个块的最大数据个数
    * @param find
    * @return
    */
  def blockSearch(search: Array[Int], sizePerBlock: Int, find: Int): Int = {
    //获得索引表
    val indexArray = getIndexArray(array, sizePerBlock)
    val blockIndex: Int = findBlockIndex(indexArray, find)

    if (blockIndex != -1) {
      println(s"处于第${blockIndex}块中")
      var start = blockIndex * sizePerBlock - 1 + 1
      if (start < 0) start = 0
      val end = (blockIndex + 1) * sizePerBlock - 1
      println(s"$start ~ $end")

      for (i <- start to end) {
        if (search(i) == find) return i
      }

    }

    return -1
  }

  def findBlockIndex(indexArray: Array[Int], find: Int): Int = {
    for (i <- 0 until indexArray.length) {
      if (indexArray(i) >= find) {
        return i
      }
    }
    return -1
  }

  val array = Array[Int](2, 4, 5, 63, 5, 6, 2, 3, 89, 34, 34, 7, 8).sorted
  printlnArray(array)
  //  println(s"元素个数: ${array.size}")
  var length = 3
  val result = blockSearch(array, length, 4)
  result match {
    case -1 => println("no found")
    case _ => println(s"location:${result}")
  }
}
