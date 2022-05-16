package charpter04

object WhileLoop {
  def main(args: Array[String]): Unit = {
    //while
    var a = 10
    while (a>=1){
      println("while loop"+a)
      a-=1
    }
    // do while
    var b = 0
    do{
      println(" do while"+b)
    }while(b>0)
  }

}
