package day3

/**
  * Created by doctorq on 2017/6/10.
  */
case class Book(isbn: String)

case class Message(var sender: String, recipient: String, body: String)


object BookTest extends App {

  val frankenstein = Book("978")
  val message1 = Message("1", "2", "3")
  message1.sender = "2"
  println(message1.sender)

}
