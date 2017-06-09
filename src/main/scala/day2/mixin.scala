package day2

/**
  * Created by doctorq on 2017/6/9.
  */
abstract class A {
  val message: String
}

class B extends A {
  override val message: String = "I am b"
}

trait C extends A {
  def loudMessage = message.toUpperCase

}

class D extends B with C


