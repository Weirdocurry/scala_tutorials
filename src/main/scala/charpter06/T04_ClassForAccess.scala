package charpter06

object T04_ClassForAccess {

}

//定义一个父类
class Person{
  private var idCard:String = "35233566"
  protected var name:String = "alice"
  var sex:String = "female"
  private[charpter06] var age:Int = 18

  def printInfo() = {
    println(s"person:$idCard$name$sex$age")
  }
}
