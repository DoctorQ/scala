package day14

/**
  * Created by doctorq on 2017/6/19.
  * 快排
  */
object QuickSort extends App {


  def sort(unSortList: List[Int]): List[Int] = {

    if (unSortList.isEmpty || unSortList.size == 1) return unSortList
    val flag: Int = unSortList.head
    //过滤得到小于等于基准值的数据
    val lessFlag = for (item <- unSortList.tail if item <= flag) yield item
    //过滤得到大于基准值的数据
    val greaterFlag = for (item <- unSortList.tail if item > flag) yield item
    //递归排序左右两侧的元素
    //.:::是Set中方法，向当前列表前面添加参数列表,而:::只是链接2个列表。
    //val sorted = sort(greaterFlag).:::(sort(lessFlag) :+ flag)
    val sorted = (sort(lessFlag) :+ flag) ::: sort(greaterFlag)
    sorted
  }


  val nilList = Nil
  sort(nilList)


  val list = List[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34)

  val sortedList = sort(list)

  sortedList.foreach(item => print(s"$item "))
}
