package day2

/**
  * Created by doctorq on 2017/6/9.
  */
object StringIteratorTest extends App {

  class Iter extends StringIterator(args(0)) with RichIterator

  val iter = new Iter
  iter foreach println
}
