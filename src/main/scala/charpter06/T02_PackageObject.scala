//package charpter06
//
//object T02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    commonMethod()
//    println(commonValue)
//  }
//
//}

package charpter06 {
  object T02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }

  }
}

package ccc{
  package ddd{
    object T02_PackageObject{
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }
  }
  //定义一个包对象
  package object ddd{
    val school:String = "atguigu"
  }
}