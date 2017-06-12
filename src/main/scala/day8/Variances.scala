package day8

/**
  * Created by doctorq on 2017/6/12.
  *
  * 型变:协变(covariant)和逆变(contravariant),非型变(invariant)
  */
object Variances extends App {

  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach { animal =>
      println(animal.name)
    }
  }

  val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
  val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

  printAnimalNames(cats)
  printAnimalNames(dogs)
}

class Convariant[+A]

class Contravariant[-A]

class InVariant[A]

abstract class Animal {
  def name: String
}

case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal


