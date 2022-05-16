package charpter06

object T15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()

    //砖石问题，特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}

trait Knowledge15{
  var amount:Int = 0
  def increase():Unit = {
    println("knowledge increased")
  }
}
trait Talent15{
  def singing():Unit
  def dancing():Unit
  def increase():Unit = {
    println("talent increased")
  }
}

class Student15 extends Person13 with Knowledge15 with Talent15{
  override def dancing():Unit = println("dancing")

  override def singing():Unit = println("singing")

  override def increase(): Unit = super[Person13].increase()
}

//定义球类特征
trait Ball{
  def describe():String = "ball"
}

trait ColorBall extends Ball{
  var color:String = "red"
  override def describe():String = color + super.describe()
}

trait CategoryBall extends Ball{
  var category:String = "foot"
  override def describe():String = category + super.describe()
}

//定义一个自定义球的类
class MyFootBall extends CategoryBall with ColorBall{
  override def describe():String = "my ball is a"+super[CategoryBall].describe()
}

//特质和抽象类的区别
//1.优先使用特质，一个类扩展多个特质是很方便的，但却只能扩展一个抽象类
//2.如果你需要构造函数参数，使用抽象类，因为抽象类可以定义带参数的构造函数，而特质不行（有无参构造)