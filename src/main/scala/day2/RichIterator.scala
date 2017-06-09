package day2

/**
  * Created by doctorq on 2017/6/9.
  */
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next)
}
