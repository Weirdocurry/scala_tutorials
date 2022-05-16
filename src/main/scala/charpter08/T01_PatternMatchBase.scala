package charpter08

object T01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //1.基本定义语法
    val x:Int = 5
    val y:String = x match{
      case 1=> "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    //2.示例：用模式匹配实现简单二元运算
    val a = 25
    val b = 13

    def matchDualOp(op:Char) = op match {
      case '+' => a+b
      case '-' => a-b
      case '*' => a*b
      case '/' => a/b
      case '%' => a%b
      case _ => "非法运算符"
    }
    println(matchDualOp('+'))
    println(matchDualOp('-'))
    println(matchDualOp('\\'))

    //3.模式守卫
    //求一个整数的绝对值
    def abs(num:Int):Int = {
      num match {
        case i if i>=0 => i
        case i if i<0 => -i
      }
    }
    println(abs(-1))
    println(abs(10))

  }

}
