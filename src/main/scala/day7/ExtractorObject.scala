package day7

/**
  * Created by doctorq on 2017/6/10.
  * 提取器对象，含有unapply对象
  */
class ExtractorObject {

}

import scala.util.Random

object CustomerId {
  def apply(name: String) = s"$name -- ${Random.nextLong()}"

  def unapply(customerID: String): Option[String] = {
    val name = customerID.split("--").head
    if (name.nonEmpty) Some(name) else None
  }

  def main(args: Array[String]): Unit = {
    val customer1Id = CustomerId("Sukyoung")
    customer1Id match {
      case CustomerId(name) => println(name)
      case _ => println("Could not extract a CustomerID")
    }

    val CustomerId(name2) = "--asdfasdfasdf"
  }
}
