package charpter07

object T01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1.创建数组
    val arr:Array[Int] = new Array[Int](10)
    //另一种创建方式
    val arr2 = Array(12,37,42,58,97)

    //2.访问数组中的元素
    println(arr(0))

    arr(0) = 12
    println(arr(0))

    //3.数组的遍历
    //1)普通for循环
    for (i<- 0 until arr.length){
      println(arr(i))
    }
    for(i<-arr2.indices) println(arr2(i))

    //2)直接遍历所有元素
    for (elem <- arr2) println(elem)
    //3)迭代器的使用
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())

    //4)调用foreach方法
    arr2.foreach((elem:Int)=>println(elem))
    arr.foreach(println)

    println(arr2.mkString("--"))

    //4.添加元素
    //在后面添加
    val newArr = arr2.:+(73)
    println(newArr.mkString("--"))

    //在前面添加
    val newArr2 = newArr.+:(12)
    println(newArr2.mkString("--"))

    val newArr3 = newArr2 :+ 15
    val newArr4 = 19 +: 29 +: newArr3 :+ 26 :+ 73
    println(newArr4.mkString("--"))
  }

}
