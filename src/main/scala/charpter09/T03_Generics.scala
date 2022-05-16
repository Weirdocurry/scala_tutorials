package charpter09

object T03_Generics {
  def main(args: Array[String]): Unit = {
    //1.协变和逆变
    val child:Parent = new Child
    val childList:MyCollection[Parent] = new MyCollection[Child]

    //2.上下限
    def test[A<:Child](a:A):Unit = {
      println(a.getClass.getName)
    }

    test[Child](new SubChild)
  }

}

//定义继承关系
class Parent{}
class Child extends Parent{}
class SubChild extends Child{}

//定义带泛型的集合关系
class MyCollection[+E]{}