package charpter05

object T05_Lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name:String) =>{println(name)}
    fun("atguigu")

    //定义一个函数，以函数作为参数输入
    def f(func:String => Unit):Unit = {
      func("atguigu")
    }
    f(fun)

    //匿名函数简化原则
    //1.参数的类型可以省略，会根据形参进行自动推导
    f((name)=>{println(name)})
    //2.类型省略之后，发现只有一个参数，则圆括号可以省略
    f(name => {println(name)})
    //3.匿名函数如果只有一行，则大括号也可以省略
    f(name => println(name))
    //4.如果参数只出现一次，则参数省略后且后面参数可以用_代替
    f(println(_))
    //5.如果可以推断出当前传入的println是一个函数体，可以省略下划线
    f(println)

    //实际实例：定义一个"二元运算"函数,只操作1和2两个数，但是具体运算通过参数传入
    def dualFuncionOneandTwo(fun:(Int,Int) => Int):Int = {
      fun(1,2)
    }
    val add = (a:Int,b:Int) => a+b
    println(dualFuncionOneandTwo(add))

    //匿名函数简化
    println(dualFuncionOneandTwo((a:Int,b:Int) => a-b))
    println(dualFuncionOneandTwo((a,b) => a+b))
    println(dualFuncionOneandTwo(_+_))
  }
}
