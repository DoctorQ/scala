package day14

/**
  * Created by doctorq on 2017/6/28.
  * 选择排序,n平方
  */
object SelectionSort extends Utils with App {


  def sort(data: Array[Int]): Array[Int] = {
    for (i <- 0 until data.size) {
      var min = data(i)
      var minIndex = i
      for (j <- i + 1 until data.size) {
        if (data(j) <= min) {
          min = data(j)
          minIndex = j
        }
      }
      if (minIndex != i) {
        swap(data, i, minIndex)
      }
    }
    data
  }


  val list = Array(15, 4, 3, 23, 5, 6, 7, 34, 6, 7, 3, 5, 7, 8, 3, 4, 6, 8, 3, 5, 7)

  printlnArray(sort(list))
  printlnArray(list.sorted)

}
