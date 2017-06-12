package day8

/**
  * Created by doctorq on 2017/6/12.
  * 逆变
  */
object Contravariance extends App {
  val myCat: Cat = Cat("Boots")

  def printMyCat(printer: Printer[Cat]): Unit = {
    printer.print(myCat)
  }

  val catPrinter: Printer[Cat] = new CatPrinter

  val animalPrinter: Printer[Animal] = new AnimalPrinter
  //因为Cat是Animal的子类,当Printer[-A]是逆变时，Printer[Animal]自然是Printer[Cat]子类，所以
  //自然就能传递到以Printer[Cat]为参数的函数printMyCat中。
  printMyCat(catPrinter)
  printMyCat(animalPrinter)


}

abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(value: Animal): Unit =
    println("The animal's name is: " + value.name)
}

class CatPrinter extends Printer[Cat] {
  def print(value: Cat): Unit =
    println("The cat's name is: " + value.name)
}
