package day2

import com.doctorq.day1.User

import scala.collection.mutable.ArrayBuffer

/**
  * Created by doctorq on 2017/6/9.
  */
object Day2Test {
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)

    println(iterator.next())
    println(iterator.next())


    val dog = new Dog("Kitty")
    val cat = new Cat("Tom")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)

    animals.foreach(pet => println(pet.name))


    val d = new D
    println(d.message)
    println(d.loudMessage)
  }
}
