package charpter01

class Student (name:String,var age:Int){
  def printInfo():Unit = {
    println(name+" "+age+" "+Student.school)
  }
}

//引入伴生对象
object Student{
  val school:String = "atguigu"

  def main(args:Array[String]):Unit = {
    val alice = new Student(name="alice",age=20)
    val bob = new Student(name="bob",age=23)

    alice.printInfo()
    bob.printInfo()
  }
}
