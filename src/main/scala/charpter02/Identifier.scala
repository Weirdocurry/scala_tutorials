package charpter02

object Identifier {
  def main(args: Array[String]): Unit = {
    //1.以字母或者下划线开头，后接字母/数字/下划线
    val hello:String = ""
    var hello123 = ""

    //2.以操作符开头，且只包含操作符(+ - * / # !等)
    val -+/ = "hello"
    println(-+/)

    //3.用反引号`...`包括的任意字符串，即使是scala关键字也可以
    val `if` = "if"
    println(`if`)
  }

}
