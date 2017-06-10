package day3

/**
  * Created by doctorq on 2017/6/10.
  * 结构比较，case类之间的比较，只对比结构
  */
object ClassComparison extends App {
  val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val messageAreTheSame = message2 == message3

  println(messageAreTheSame)


  val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
  val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
  val message6 = message4.copy()
  println(message5.sender)
  println(message5.recipient)
  println(message5.body)

  println(message6.sender)
  println(message6.recipient)
  println(message6.body)
}

