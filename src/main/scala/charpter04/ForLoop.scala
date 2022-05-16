package charpter04

object ForLoop {
  def main(args: Array[String]): Unit = {
    //范围遍历
    for (i<- 1 to 10){
      println(i+".hello word")
    }

//    for (i<- Range(1,10)){
//      println(i)
//    }
    for (i<- 1 until 10){
      println(i)
    }

    //集合遍历
    for (i<- Array(12,34,53)){
      println(i)
    }

    //循环守卫
    for (i<- 1 to 10 if i !=5){
      println(i)
    }

    //循环步长
    for (i<- 1 to 10 by 2){
      println(i)
    }

    for (i<- 13 to -2 by -2){
      println(i)
    }

    for (i<- 1 to 10 reverse){
      println(i)
    }

    for (i<- 1.0 to 10.0 by 0.5){
      println(i)
    }

    //循环嵌套
    for (i<- 1 to 3){
      for (j<- 1 to 3){
        println("i="+i+",j="+j)
      }
    }

    for (i<- 1 to 3;j<- 1 to 5){
      println("i="+i+",j="+j)
    }

    //循环引入变量
    for (i<- 1 to 10;j = 10-i){
      println("i="+i+",j="+j)
    }

    for {i<- 1 to 10
         j = 10-i}{
      println("i="+i+",j="+j)
    }

    //循环返回值
    var a = for (i <- 1 to 10) {
      i
    }
    println("a = "+a)

    val b = for (i<- 1 to 10) yield i
    print("b="+b)



  }

}
