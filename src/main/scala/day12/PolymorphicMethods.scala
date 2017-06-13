package day12

import day11.VerifiedTweeter

/**
  * Created by doctorq on 2017/6/13.
  * 动态方法
  */
object PolymorphicMethods extends App {
  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if (length < 1)
      Nil
    else
      x :: listOfDuplicates(x, length - 1)
  }

  println(listOfDuplicates[Int](3, 4)) // List(3, 3, 3, 3)
  println(listOfDuplicates("La", 8)) // List(La, La, La, La, La, La, La, La)
  println(listOfDuplicates(new VerifiedTweeter("tes"), 8))
}
