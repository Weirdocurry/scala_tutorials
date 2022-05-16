package charpter05

object T12_MyWhile {
  def main(args: Array[String]): Unit = {
    //1.常规的while循环
    var n = 10
    while(n>=1){
      println(n)
      n-=1
    }

    //2.用闭包实现一个函数，将代码块作为参数传入,递归调用
    def myWhile(condition: =>Boolean):(=>Unit)=>Unit = {
      //内层函数需要递归调用，参数就是循环体
      def doloop(op: =>Unit):Unit = {
        if(condition){
          op
          myWhile(condition)(op)
        }
      }
      doloop _
    }

    n = 10
    myWhile(n>=1){
      println(n)
      n-=1
    }
    //3.用匿名函数实现
    //4.柯里化
  }

}
