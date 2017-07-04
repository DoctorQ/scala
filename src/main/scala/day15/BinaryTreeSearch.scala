package day15

/**
  * Created by doctorq on 2017/6/30.
  * http://blog.csdn.net/chinabhlt/article/details/47420391
  * 二叉树查找
  */
object BinaryTreeSearch extends App {
  //先序,根节点->左子树->右子树
  def perOrder(node: BinaryTreeNode): Unit = {

    println(node.value)

    if (node.left != None) {
      //      println(s"根节点:${node.value},左子节点:${node.left.get.value}")
      perOrder(node.left.get)
    }

    if (node.right != None) {
      //      println(s"根节点:${node.value},右子节点:${node.right.get.value}")
      perOrder(node.right.get)
    }

  }

  //中序,左子树->根节点->右子树
  def inOrder(node: BinaryTreeNode): Unit = {

    if (node.left != None) {
      //      println(s"根节点:${node.value},左子节点:${node.left.get.value}")
      perOrder(node.left.get)
    }

    println(node.value)

    if (node.right != None) {
      //      println(s"根节点:${node.value},右子节点:${node.right.get.value}")
      perOrder(node.right.get)
    }

  }

  //后序:左子树->右子树->根节点
  def postOrder(node: BinaryTreeNode): Unit = {
    if (node.left != None) {
      //      println(s"根节点:${node.value},左子节点:${node.left.get.value}")
      perOrder(node.left.get)
    }


    if (node.right != None) {
      //      println(s"根节点:${node.value},右子节点:${node.right.get.value}")
      perOrder(node.right.get)
    }

    println(node.value)

  }

  //层序:按深度遍历，从根节点所在的层开始
  def sequence(node: BinaryTreeNode): Unit = {

  }


  var rootNode = new BinaryTreeNode(15)
  val list = List(1, 4, 5, 2, 3, 8, 54, 23, 21, 43, 10, 13)

  list.foreach(item => {
    rootNode.buildTree(new BinaryTreeNode(item))
  })

  println("先序")

  perOrder(rootNode)

  println("中序")

  inOrder(rootNode)

  println("后序")

  postOrder(rootNode)

}
