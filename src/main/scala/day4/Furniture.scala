package day4

/**
  * Created by doctorq on 2017/6/10.
  */
sealed abstract class Furniture

case class Couch() extends Furniture

case class Chair() extends Furniture
