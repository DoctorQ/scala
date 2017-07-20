package day17


/**
  * 钢条切割
  */
object SteelCut extends App {

  /**
    *
    * @param data 钢条不同段的价格
    * @param n    钢条长度
    * @return 最大值
    */
  def maxValue(data: Array[Int], n: Int): Int = {
    if (n > data.length) {
      println("超过价格表范围")
      return -1
    }
    if (n == 0) return n
    var q = Integer.MIN_VALUE

    for (i <- 1 to n) {
      q = Integer.max(q, data(i - 1) + maxValue(data, n - i))
    }
    return q
  }

  val array = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

  val result = maxValue(array, 10)

  println(result)

}
