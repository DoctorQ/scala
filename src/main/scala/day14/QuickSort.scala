package day14

/**
  * Created by doctorq on 2017/6/19.
  * 快排
  * 时间复杂度:nlogn
  */
object QuickSort extends App with Utils {


  def sort(data: List[Int]): List[Int] = {

    if (data.isEmpty || data.size == 1) return data
    val flag = data.head
    //过滤得到小于等于基准值的数据
    val left = for (item <- data.tail if item <= flag) yield item
    //过滤得到大于基准值的数据
    val right = for (item <- data.tail if item > flag) yield item
    //递归排序左右两侧的元素
    //.:::是Set中方法，向当前列表前面添加参数列表,而:::只是链接2个列表。
    //val sorted = sort(greaterFlag).:::(sort(lessFlag) :+ flag)
    val sorted = (sort(left) :+ flag) ::: sort(right)
    sorted
  }

  val list = List[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34)

  val sortedList = sort(list)

  printlnList(sortedList)

}
