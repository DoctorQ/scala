package day10

/**
  * Created by doctorq on 2017/6/12.
  */

class Graph {

  class Node {
    var connectedNodes: List[Graph#Node] = Nil

    def connectTo(node: Graph#Node): Unit = {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }

  }


  var nodes: List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }


}

object InnerClass extends App {

  val graph1: Graph = new Graph
  val node1: graph1.Node = graph1.newNode
  val node2: graph1.Node = graph1.newNode
  val node3: graph1.Node = graph1.newNode

  node1.connectTo(node2)
  node3.connectTo(node1)

  val graph2: Graph = new Graph
  val node4: graph2.Node = graph2.newNode

  node1.connectTo(node4)
}
