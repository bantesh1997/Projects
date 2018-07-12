trait Queue {

  private val queue = new scala.collection.mutable.ListBuffer[Int]

  def dequeue = if (queue.isEmpty) {
    println("Queue is empty")
    None
  }
  else Some(queue.remove(0))

  def enqueue(element: Int) = queue += element

  def showQueue = println(s"Queue: $queue")
}

class DoubleQueue extends Queue {
  override def enqueue(element: Int) = super.enqueue(2 * element)
}

class SquareQueue extends Queue {
  override def enqueue(element: Int) = super.enqueue(element * element)
}

object QueueMain extends App {
  val obj1 = new DoubleQueue()
  obj1.enqueue(5)
  obj1.enqueue(8)
  obj1.enqueue(7)
  obj1.enqueue(6)
  obj1.showQueue
  val obj2 = new SquareQueue()
  obj2.enqueue(2)
  obj2.enqueue(3)
  obj2.enqueue(4)
  obj2.enqueue(1)
  obj2.dequeue
  obj2.showQueue

}



