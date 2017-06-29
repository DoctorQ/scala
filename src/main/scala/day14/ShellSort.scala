package day14

/**
  * Created by doctorq on 2017/6/28.
  * 希尔排序:缩小增量排序
  * 时间复杂度nlog2n~n2之间
  */
object ShellSort extends App with Utils {


  def sort(unSort: Array[Int]): Array[Int] = {
    var step = unSort.size / 2

    while (step > 0) {
      //分成的子数组个数为step
      for (i <- 0 until step) {
        //某个子数组采用插入排序算法进行排序
        for (j <- i + step to(unSort.size - 1, step)) {
          if (unSort(j) < unSort(j - step)) {
            var k = j - step
            while (k > 0 && unSort(k + step) < unSort(k)) {
              swap(unSort, k, k + step)
              k -= step
            }
          }

        }
      }
      step /= 2
    }

    unSort
  }

  val list = Array(1, 4, 3, 5, 7, 3, 6, 8, 9, 23, 4, 5, 7, 2, 4, 5, 6, 7, 78, 3, 4)
  printlnArray(sort(list))

}
