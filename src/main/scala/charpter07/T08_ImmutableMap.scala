package charpter07

object T08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //1.创建map
    val map1:Map[String,Int] = Map("a" -> 13,"b" -> 25,"hello" -> 3)
    println(map1)
    println(map1.getClass)

    //2.遍历元素
    map1.foreach(println)
    map1.foreach((kv:(String,Int)) => println(kv))

    //3.取map中所有的key或者value
    for (key <- map1.keys){
      println(s"$key ---> ${map1.get(key)}")
    }

    //4.访问某一个key的value
    println(map1.get("a").get)
    println(map1.get("c"))
    println(map1.getOrElse("c",0))

    println(map1("a"))
  }

}
