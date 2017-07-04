package day15

/**
  * Created by doctorq on 2017/7/4.
  */
class BinaryTreeNode(val value: Int) {
  var left: Option[BinaryTreeNode] = None
  var right: Option[BinaryTreeNode] = None

  def buildTree(node: BinaryTreeNode): Unit = {
    if (node.value < value) {
      //左子树
      if (left == None) {
        left = Some(node)
      } else {
        left.get.buildTree(node)
      }
    } else {
      //右子树
      if (right == None) {
        right = Some(node)
      } else {
        right.get.buildTree(node)
      }
    }
  }

  def printNode(): Unit = {
    println(s"$value")
  }
}
