package charpter02

import charpter01.Student

object DataType {
  def main(args: Array[String]): Unit = {
    //1.整数类型
    val a1:Byte = 127
//    val a2:Byte = 128 //error
    val a3 = 12 //整数默认类型为Int
    val a4 = 13245679864321L //长整形数值定义

    val b1:Byte = 10
    val b2:Byte = 10+20
    println(b2)
    val b3:Byte = (b1+20).toByte
    println(b3)

    //2.浮点类型
    val f1:Float = 1.2345f

    //3.字符类型
    val c1:Char = 'a'
    println(c1)

    //特殊字符
    val c3:Char = '\t'
    val c4:Char = '\n'
    println("abc"+c3+"def")
    println("abc"+c4+"def")

    //转义字符
    val c5 = '\\' //表示\自身
    val c6 = '\"' //表示"
    println("abc"+c5+"def")
    println("abc"+c6+"def")

    //字符变量底层保存ASCII码
    //布尔类型
    val isTrue:Boolean = true
    println(isTrue)

    //5.空类型
    //5.1空值Unit
    def m1():Unit={
      println("m1被调用执行")
    }
    val a = m1()
    println(a)
    //5.2空引用
//    val n:Int = null //error
    var student = new Student("alice",23)
    student = null
    println(student)
    //5.3Nothing
    def m2(n:Int):Int={
      if (n==0)
        throw new NullPointerException
      else
        return n
    }
    val b = m2(2)
    println(b)
  }
}
