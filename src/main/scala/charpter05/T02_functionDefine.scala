package charpter05

object T02_functionDefine {
  def main(args: Array[String]): Unit = {
    //1.函数1：无参，无返回值
    def f1():Unit = {
      println("1.无参，无返回值")
    }

    f1()
    println(f1())
    //2.函数2：无参，🈶️返回值
    def f2():Int = {
      println("无参数，有返回值")
      return 12
    }
    println(f2())
    //3.有参数，无返回值
    def f3(name:String):Unit = {
      println("3.有参数，没有返回值"+name)
    }
    println(f3("alice"))
    //4.有参数，又返回值
    def f4(name:String):String = {
      println("4.有参数，有返回值"+name)
      return "hi"+name
    }
    println(f4("alice"))
    //5.多参数，无返回值
    def f5(name1:String,name2:String):Unit = {
      println("5.多参数，无返回值")
      println(s"${name1}+${name2}")
    }
    println(f5("alice","bob"))
    //6.多参数，有返回值
    def f6(name1:String,name2:String):String = {
      println("6.多参数，有返回值")
      return name1+name2+"有返回"
    }
    println(f6("curry","green"))
  }

}
