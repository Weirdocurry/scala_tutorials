package charpter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object TBreaks {
  def main(args: Array[String]): Unit = {
    //采用抛出异常的方式，推出循环
    try{
      for (i <- 0 until 5){
        if (i==3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e:Exception =>
    }

    //使用scala中的Breaks类的break方法，实现啊异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 0 until 5){
        if (i==3)
          Breaks.break()
        println(i)
    }
    )

    breakable(
      for (i <- 0 until 5){
        if (i==3)
          break()
        println(i)
      }
    )

    println("这是循环外的代码")
  }
}
