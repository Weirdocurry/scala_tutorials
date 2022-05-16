package charpter08

object T05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("alice",18)

    //针对对象实例的内容进行匹配
    val result = student match{
      case Student1("alice",18) => "alice,18"
      case _ => "else"
    }

    println(result)
  }

}

//定义样例类（里面伴生对象、apply、unapply都自动生成)
case class Student1(name:String,age:Int)