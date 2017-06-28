package day14

import scala.collection.mutable.ArrayBuffer


/**
  * Created by doctorq on 2017/6/19.
  * 堆排序：采用大顶堆,根节点大于两层元素，该类需要满足具备三个方法: 1.由正常数组变换为符合堆结构的方法
  * 2.向堆中插入数据。3.从堆中删除数据。
  * 重要特性：1.根节点索引值为i，根节点元素满足Key[i]>=Key[2i+1]&&key>=key[2i+2]
  * 2.非叶子节点数量<=总节点数的/2
  */
object HeapSort extends App with Utils {


  /**
    * 生成对结构
    *
    * @param unSortHeap 任意数组
    * @return 符合堆结构的数组
    */
  def generateHeap(unSortHeap: Array[Int]): Array[Int] = {
    val num = unSortHeap.length
    if (num <= 1) return unSortHeap
    var tempUnSortHeap = unSortHeap


    for (i <- num / 2 - 1 until num) {
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
    var childIndex = index

    var parentIndex = (childIndex - 1) / 2
    var temp = heap(childIndex)
    while (parentIndex >= 0 && childIndex != 0) {
      if (heap(parentIndex) < temp) {
        //swap
        heap(childIndex) = heap(parentIndex)
        heap(parentIndex) = temp
      }
      childIndex = parentIndex
      parentIndex = (childIndex - 1) / 2
      temp = heap(childIndex)
    }
    heap
  }

  /**
    * 从堆中删除数据
    *
    * @param sortedHeap 已排序的队列
    * @param index      索引值
    */
  def deleteFromHeap(sortedHeap: Array[Int], index: Int): Array[Int] = {
    val newArray = sortedHeap.toBuffer
    newArray.remove(index)
    generateHeap(newArray.toArray)
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



  private def sortAll = {
    while (sortedList.length > 0) {
      print(s"${sortedList.head} ")
      sortedList = generateHeap(sortedList.tail)
      //    printlnList(sortedList)
    }
  }

  val list = Array[Int](1, 4, 3, 5, 6, 8, 2, 3, 89, 4, 34, 50)
  var sortedList = generateHeap(list)
  printlnArray(sortedList)
  //添加新元素
  printlnArray(insertToHeap(sortedList, 76))

  //删除
  printlnArray(deleteFromHeap(sortedList, 3))
  //堆排序,按大到小输出元素
  sortAll


}
