package com.knoldus


// val obj = new C t1 t2

trait Queue {

  private val queue = new scala.collection.mutable.ListBuffer[Int]

  def dequeue = if (queue.isEmpty) {
    println("Queue is empty")
    None
  }
  else Some(queue.remove(0))


  def enqueue(x: Int) = queue += x

  def showQueue = println(s"Queue: $queue")
}

trait DoubleQueue extends Queue {
  abstract override def enqueue(x: Int) = super.enqueue(2 * x)
}

trait SquareQueue extends Queue {
  abstract override def enqueue(x: Int) = super.enqueue(x * x)

}


object QueueMain extends App {

  val queue = new Queue with DoubleQueue with SquareQueue
  println(queue.enqueue(5))
  /*
  val dq = new DoubleQueue
  dq.enqueue(1)
  dq.enqueue(2)
  dq.showQueue
  val sq = new SquareQueue
  sq.enqueue(3)
  sq.enqueue(4)
  sq.showQueue

  dq.dequeue
  dq.showQueue
*/

}