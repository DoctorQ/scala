package day10

/**
  * Created by doctorq on 2017/6/12.
  * 抽象类型,可以存在于trait和abstract class中
  */

trait Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]

  def length = element.length
}

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

object AbstractType extends App {
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2)
    }

  val buf = newIntSeqBuf(7, 8)
  println("length = " + buf.length)
  println("content = " + buf.element)

}
