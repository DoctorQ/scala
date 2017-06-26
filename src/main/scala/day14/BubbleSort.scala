package day14


/**
  * Created by doctorq on 2017/6/19.
  * 冒泡排序:外层控制次数,内层替换
  */
object BubbleSort extends App {


  def sort(unSort: Array[Int]): Array[Int] = {

    val size = unSort.size
    for (i <- 0 until size - 1) {
      for (j <- 0 until size - 1 - i) {
        if (unSort(j) > unSort(j + 1)) {
          val temp = unSort(j)
          unSort(j) = unSort(j + 1)
          unSort(j + 1) = temp
        }
      }
    }
    unSort
  }

  val list = Array[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34, 50)

  val sortedList = sort(list)

  sortedList.foreach(item => print(s"$item "))


}
