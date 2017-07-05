package day15

/**
  * Created by doctorq on 2017/6/30.
  * 顺序查找,线性查找
  */
object SortSearch extends App {

  def search(array: Array[Int], find: Int): Unit = {
    if (array.size == 0) return
    println(s"I want to find ${find} : ")
    val findArray = for (i <- 0 until array.length if (array(i) == find)) yield array(i)
    if (findArray.size != 0) {
      println(s"yes, I find it")
      findArray.foreach(println)
    } else {
      println(s"sorry!I don't found")
    }
  }


  val array = Array[Int](2, 4, 5, 63, 5, 6, 2, 3, 89, 34, 34, 7, 8)

  search(array, 3)
  search(array, 9)
}
