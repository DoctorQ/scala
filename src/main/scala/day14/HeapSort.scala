package day14


/**
  * Created by doctorq on 2017/6/19.
  * 堆排序：采用大顶堆,根节点大于两层元素，该类需要满足具备三个方法: 1.由正常数组变换为符合堆结构的方法
  * 2.向堆中插入数据。3.从堆中删除数据。
  * 重要特性：1.根节点索引值为i，根节点元素满足Key[i]>=Key[2i+1]&&key>=key[2i+2]
  * 2.非叶子节点数量<=总节点数的/2
  */
object HeapSort extends App {


  /**
    * 生成对结构
    *
    * @param unSortHeap 任意数组
    * @return 符合堆结构的数组
    */
  def generateHeap(unSortHeap: Array[Int]): Array[Int] = {
    var tempUnSortHeap = unSortHeap
    val num = tempUnSortHeap.length
    for (i <- 0 until num) {
      tempUnSortHeap = sort(tempUnSortHeap, i)
    }
    tempUnSortHeap
  }

  /**
    * 排序特定子树
    *
    * @param heap  未排序堆
    * @param index 当前排序索引值
    * @return 某子树已经排序完
    */
  def sort(heap: Array[Int], index: Int): Array[Int] = {
    //父节点
    var tempIndex = index
    var parentIndex = (tempIndex - 1) / 2
    val temp = heap(tempIndex)
    import scala.util.control.Breaks._
    breakable {
      while (parentIndex >= 0) {
        if (heap(parentIndex) >= temp) break()
        val parentTemp = heap(parentIndex)
        heap(tempIndex) = parentTemp
        heap(parentIndex) = temp
        tempIndex = parentIndex
        parentIndex = (tempIndex - 1) / 2
      }
    }
    heap
  }

  /**
    * 从堆中删除数据
    *
    * @param sortedHeap 已排序的队列
    * @param index      索引值
    */
  def deleteFromHeap(sortedHeap: Array[Int], index: Int): Unit = {

  }


  /**
    * 向堆中插入数据
    *
    * @param sortedHeap 已排序的队列
    * @param newElement 添加到对中的元素
    */
  def insertToHeap(sortedHeap: Array[Int], newElement: Int): Array[Int] = {
    val newList = sortedHeap :+ newElement
    sort(newList, newList.length - 1)
  }

  def printlnList(sortedHeap: Array[Int]): Unit = {
    sortedHeap.foreach(item => print(s"$item "))
    println("sorted!")
    //    for (k <- sortedHeap.indices) {
    //      println(s"($k->${sortedHeap(k)})")
    //    }
  }

  val list = Array[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34, 50)
  var sortedList = generateHeap(list)
  //  printlnList(sortedList)
  //  printlnList(insertToHeap(sortedList, 76))
  //  val list1 = Array[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34, 50, 76)
  //  printlnList(generateHeap(list1))

  while (sortedList.length > 0) {
    print(s"${sortedList.head} ")
    sortedList = generateHeap(sortedList.tail)
  }
}
