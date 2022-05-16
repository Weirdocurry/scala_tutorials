package charpter05

object T03_functionParameter {
  def main(args: Array[String]): Unit = {
    //1.可变参数
    def f1(str:String*):Unit = {
      println(str)
    }
    f1("alice")
    f1("alice","bob")

    //2.如果参数列表多个参数，那么可变参数一般放置在最后
    def f2(str1:String,str2:String*):Unit = {
      println(str1+"\t"+str2)
    }
    f2("alice")
    f2("alice","bob")

    //3.参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name:String="atguigu"):Unit = {
      println(name)
    }
    f3()

    //4.带名参数
    def f4(name:String,age:Int):Unit = {
      println(s"${age}岁的${name}在学习")
    }
    f4("alice",20)
    f4(age=25,name = "bob")

  }

}
