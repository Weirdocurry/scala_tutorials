package charpter08

object T06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list:List[(String,Int)] = List(("a",12),("b",35),("c",27),("a",13))

    //1.map转换，实现key不变，value2倍
    val newList = list.map(tuple =>(tuple._1,tuple._2*2))

    //2.用模式匹配对元组元素赋值，实现功能
    val newList2 = list.map(
      tuple => {
        tuple match {
          case (word,count) =>(word,count*2)
        }
      }
    )

    //3.省略lambda表达式写法进行简化
    val newList3 = list.map {
          case (word,count) =>(word,count*2)
        }
    println(newList)
    println(newList2)
    println(newList3)

    //偏函数应用
    //对输入数据分为不同的情形，正，负，0
    val positiveAbs:PartialFunction[Int,Int] = {
      case x if x>0 =>x
    }
    val negativeAbs:PartialFunction[Int,Int] = {
      case x if x<0 => -x
    }
    val zeroAbs:PartialFunction[Int,Int] = {
      case x if x==0 => 0
    }

    def abs(x:Int):Int = (positiveAbs orElse negativeAbs orElse zeroAbs)(x)

    println(abs(-37))
    println(abs(35))
    println(abs(0))
  }

}
