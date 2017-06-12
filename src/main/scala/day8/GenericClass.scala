package day8

/**
  * Created by doctorq on 2017/6/12.
  * 泛型
  */
class Stack[A] {

  private var elements: List[A] = Nil

  def push(x: A) {
    elements = x :: elements
  }

  def peek: A = elements.head

  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }


}

object GenericClassTest {


  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop)
    println(stack.pop)
  }

  val fruitStack = new Stack[Fruit]
  val apple = new Apple
  val banana = new Banana
  //子类也可以当成父类添加进去
  fruitStack.push(apple)
  fruitStack.push(banana)
}

class Fruit

class Apple extends Fruit

class Banana extends Fruit
