package OopsAsg.Queue
import scala.collection.mutable.ListBuffer

class DoubleQueue(queue : ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * 2)
  }

}
