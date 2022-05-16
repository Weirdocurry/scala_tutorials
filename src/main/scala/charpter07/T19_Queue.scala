package charpter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object T19_Queue {
  def main(args: Array[String]): Unit = {
    //创建一个可变队列
    val queue = new mutable.Queue[String]()

    queue.enqueue("a","b","c","d")
    println(queue)

    println(queue.dequeue())
    println(queue)

    //不可变队列
    val queue2 = Queue("a","b","c")
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)
  }

}
