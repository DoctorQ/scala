package day4

/**
  * Created by doctorq on 2017/6/10.
  * 封闭类:所有的子类型位于同一文章中
  */

class SealedClass {
  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "lie on the couch"
    case b: Chair => "Sit on the chair"
  }
}
