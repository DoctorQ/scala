package day15

/**
  * Created by doctorq on 2017/6/30.
  * 哈希查找
  * 解决冲突的两种方法：链地址法，开放地址法
  */
object HashSearch extends App {
  /**
    * 直接定址法
    *
    * @param value
    * @param length 常量
    * @return
    */
  def insertHash(array: Array[Int], value: Int, length: Int): Unit = {
    var key = value % length
    while (array(key) != 0) {
      key = (key + 1) % length
    }
    array(key) = value
  }


  def searchHash(array: Array[Int], find: Int, length: Int): Int = {
    var key = find % length
    while (array(key) != 0 && array(key) != find) {
      key = (key + 1) % length
    }
    if (array(key) == 0)
      return -1
    key
  }

  val length = 14
  val arrayBuffer = new Array[Int](length)

  val array = Array[Int](2, 4, 5, 63, 5, 6, 2, 3, 89, 34, 34, 7, 8)


  array.foreach(item => insertHash(arrayBuffer, item, length))

  //  val hash = for (i <- 0 until length if (arrayBuffer(i) != 0)) yield arrayBuffer(i)

  //  hash.foreach(println)
  arrayBuffer.foreach(println)

  val find = 34
  val hashKey = searchHash(arrayBuffer, find, length)

  hashKey match {
    case -1 => println(s"${find}' is not found")
    case _ => println(s"${find}'s hashCode is ${hashKey}")
  }


}
