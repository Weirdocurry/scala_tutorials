package charpter05

object T09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a:Int,b:Int):Int = {
      a+b
    }

    //1.考虑固定一个加数
    def addByFour(b:Int):Int = {
      4+b
    }
    //2.扩展固定参数改变的情况
    def addByfive(b:Int):Int = {
      5+b
    }

    //3.将固定参数作为另一个参数传入，但是作为"第一层参数"传入
    def addByFour1():Int=>Int = {
      val a = 4
      def addB(b:Int):Int ={
        a+b
      }
      addB
    }

    def addByA(a:Int):Int=>Int = {
      def addB(b:Int):Int = {
        a+b
      }
      addB
    }

    println(addByA(35)(24))

    //lambda表达式简写
    def addByA1(a:Int):Int=>Int = {
      (b:Int) =>{a+b}
    }

    def addByA2(a:Int):Int=>Int = {
      b => a+b
    }

    def addByA3(a:Int):Int=>Int = a+_

    //  柯里化
    def addCurrying(a:Int)(b:Int):Int = {
      a+b
    }
    println(addCurrying(35)(24))
  }

}
