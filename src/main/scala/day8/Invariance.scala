package day8

/**
  * Created by doctorq on 2017/6/12.
  */
object Invariance extends App {
  val catContainer: Container[Cat] = new Container(Cat("hello"))
  //val animalContainer: Container[Animal] = catContainer
}

class Container[A](value: A) {

  private var _value: A = value

  def getValue: A = _value

  def setValue(value: A): Unit = {
    _value = value
  }
}
