package OopsAsg.Queue
import scala.collection.mutable.ListBuffer

trait Queue {

  def enqueue(elementToBePushed : Int)

  def dequeue(queue: ListBuffer[Int]) : Int ={

    val removedElement = queue(0)
    queue.remove(0)
    removedElement
  }

}
