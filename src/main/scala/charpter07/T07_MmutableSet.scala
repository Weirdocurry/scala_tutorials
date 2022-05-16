package charpter07

import scala.collection.mutable

object T07_MmutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建set
    val set1:mutable.Set[Int] = mutable.Set(13,23,53,12,13,23,78)
    println(set1)

    //2.添加元素
    val set2 = set1 +1
    println(set1)
    println(set2)

    set1 += 11
    println(set1)

    set1.add(10)
    println(set1)

    //3.删除元素
    set1 -= 11
    println(set1)

    val flag3 = set1.remove(10)
    println(flag3)

    //4.合并集合
    val set3 = mutable.Set(11,12,14)
    val set4 = set1 ++ set3
    println(set4)

    set1 ++= set3
    println(set1)
  }

}
