package day2

/**
  * Created by doctorq on 2017/6/9.
  */
class StringIterator(s: String) extends AbsIterator {
  type T = Char

  private var i: Int = 0

  def hasNext: Boolean = i < s.length

  def next = {
    val ch = s charAt i
    i += 1
    ch
  }
}
