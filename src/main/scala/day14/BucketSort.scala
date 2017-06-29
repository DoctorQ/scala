package day14

/**
  * Created by doctorq on 2017/6/29.
  * 桶排序,一直数据范围，比如满分10分考试分数排序
  */
object BucketSort extends Utils with App {

  def sort(unSortArray: Array[Int]): Array[Int] = {
    if (unSortArray.size <= 1) return unSortArray
    val bucket = new Array[Int](10)
    for (i <- 0 until unSortArray.size) {
      bucket(unSortArray(i)) += 1
    }
    for (i <- 0 until bucket.size) {
      if (bucket(i) != 0) {
        for (j <- 1 to bucket(i)) {
          print(s"$i ")
        }
      }
    }
    unSortArray
  }

  //满分为10分
  val list = Array(1, 3, 4, 2, 5, 5, 6, 9, 3, 4, 4)
  printlnArray(list.sorted)

  sort(list)


}
