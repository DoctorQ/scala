package day2

/**
  * Created by doctorq on 2017/6/9.
  */
trait Pet {
  val name: String

}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet