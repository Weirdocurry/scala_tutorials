package charpter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object T02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1.创建可变数组
    val arr1:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(23,57,92)

    println(arr1.mkString(", "))
    println(arr2)

    //2.访问数组中的元素
    println(arr2(0))
    arr2(1) = 10
    println(arr2(1))

    //3.添加元素
    val newArr1 = arr1 :+ 15
    println(arr1)
    println(newArr1)
    println(arr1==newArr1)

    arr1 += 19
    println(arr1)
    val newarr2 = arr1+=19 //引用地址
    println(newarr2)

    77 +=: arr1
    println(arr1)
    println(newarr2)

    //推荐使用
    arr1.append(12)
    arr1.prepend(20)
    println(arr1)
    arr1.insert(1,30)
    println(arr1)

    arr1.insertAll(2,newarr2) //添加数组全部元素

    //4.删除元素
    arr1.remove(3) //根据索引删除
    println(arr1)

    arr1.remove(0,5)
    println(arr1)

    arr1 -= 13 //直接删除元素
    println(arr1)

    //5.将可变数组转换为不可变数组
    val arr:ArrayBuffer[Int] = ArrayBuffer(23,56,98)
    val newArr:Array[Int] = arr.toArray
    println(newArr.mkString(", "))
    println(arr)
    //6.不可变数组转换为可变数组
    val buffer:mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)

  }

}
