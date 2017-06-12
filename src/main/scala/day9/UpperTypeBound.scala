package day9

/**
  * Created by doctorq on 2017/6/12.
  * 上边界类型
  */

abstract class Animal {
  def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name: String = "Lion"
}

class PetContainer[P <: Pet](p: P) {
  def pet: P = p
}

object UpperTypeBound extends App {
  val dogContainer = new PetContainer[Dog](new Dog)
  val catContainer = new PetContainer[Cat](new Cat)
  //val lionContainer = new PetContainer[Lion](new Lion)//编译报错
}
