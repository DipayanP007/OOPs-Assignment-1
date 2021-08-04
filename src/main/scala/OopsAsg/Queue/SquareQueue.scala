package OopsAsg.Queue
import scala.collection.mutable.ListBuffer

class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * elementToBePushed)
  }

}
