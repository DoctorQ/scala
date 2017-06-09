package day2

/**
  * Created by doctorq on 2017/6/9.
  */
trait Iterator[A] {

  def hasNext: Boolean

  def next(): A

}


class IntIterator(to: Int) extends Iterator[Int] {
  private var current: Int = 0

  override def hasNext: Boolean = current < to

  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}
