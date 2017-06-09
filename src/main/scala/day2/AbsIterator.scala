package day2

/**
  * Created by doctorq on 2017/6/9.
  */
abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next: T

}
