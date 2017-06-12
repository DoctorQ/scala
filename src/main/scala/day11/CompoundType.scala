package day11

/**
  * Created by doctorq on 2017/6/12.
  * 混合类型
  */
class CompoundType {

  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {

    val cloned = obj.clone()
    obj.reset
    cloned
  }

}

trait Cloneable extends java.lang.Cloneable {

  override def clone(): Cloneable = {
    super.clone().asInstanceOf[Cloneable]
  }
}

trait Resetable {
  def reset: Unit
}



