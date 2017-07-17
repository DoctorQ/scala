package day14


/**
  * Created by doctorq on 2017/6/19.
  * 冒泡排序:外层控制次数,内层替换
  * 时间复杂度:nlogn
  */
object BubbleSort extends App with Utils {


  def sort(data: Array[Int]): Array[Int] = {

    val size = data.size
    for (i <- 0 until size - 1) {
      for (j <- 0 until size - 1 - i) {
        if (data(j) > data(j + 1)) {
          val temp = data(j)
          data(j) = data(j + 1)
          data(j + 1) = temp
        }
      }
    }
    data
  }

  val list = Array[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34, 50)

  val sortedList = sort(list)
  printlnArray(sortedList)
}
