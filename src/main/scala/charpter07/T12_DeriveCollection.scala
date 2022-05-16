package charpter07

object T12_DeriveCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,7,89)
    val list2 = List(3,7,2,45,56)

    //1.获取集合的头
    println(list1.head)
    //2.获取集合的尾(不是头的就是尾)
    println(list1.tail)
    //3.集合最后一个数据
    println(list2.last)
    //4.集合初始元素（不包含最后一个）
    println(list2.init)
    //5.反转
    println(list1.reverse)
    //6.取前（后）n个元素
    println(list1.take(3))
    println(list1.takeRight(4))
    //7.去掉前（后）n个元素
    println(list1.drop(3))
    println(list1.dropRight(4))

    //8.并集
    val union = list1.union(list2)
    println("union:" + union)
    println(list1 ::: list2)
    //如果是set做并集，会去重

    //9.交集
    val intersection = list1.intersect(list2)
    println(intersection)
    //10.差集
    val diff1 = list1.diff(list2)
    //11.拉链
    println("zip:"+list1.zip(list2))
    println("zip:"+list2.zip(list1))
    //12.滑窗
    for (elem <- list1.sliding(3)) println(elem)

    for (elem <- list1.sliding(3,2)) println(elem)


  }

}
