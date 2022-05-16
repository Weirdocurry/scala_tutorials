package charpter07

object T06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建set
    val set1 = Set(13,23,53,12,13,23,78)
    println(set1)

    //2.添加元素
    val set2 = set1.+(20)
    println(set2)

    //3.合并集合
    val set3 = Set(19,13,23,53,67,99)
    val set4 = set2 ++ set3
    println(set4)

    //4.删除元素
    val set5 = set3 - 13
    println(set3)
    println(set5)
  }

}
