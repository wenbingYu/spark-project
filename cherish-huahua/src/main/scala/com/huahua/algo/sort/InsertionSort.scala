package com.huahua.algo.sort

/**
 * Created by yuwenbing on 17/2/21.
 * @author wenbing.yu
 * @define : 插入法排序,初始：i=2，A[1...1]已排序，成立。保持：在迭代开始前，A[1...i-1]已排序，而循环体的目的是将A[i]插入A[1...i-1]中，使得A[1...i]排序，因此在下一轮迭代开       始前，i++，因此现在A[1...i-1]排好序了，因此保持循环不变式。终止：最后i=n+1，并且A[1...n]已排序，而A[1...n]就是整个数组，因此证毕。
 *
 */
object InsertionSort {

  def insertionSort(array: Array[Int]) = Array {

    for (i <- 1 to array.length - 1) {
      var j = i - 1

      while (j >= 0 && array(j + 1) < array(j)) {
        val key = array(j)
        array(j) = array(j + 1)
        array(j + 1) = key
        j = j - 1

      }
    }



    for (k <- 0 to array.length - 1) {
      print(array(k))
    }


  }

  def main(args: Array[String]) {


    val numbers = new Array[Int](4)
    numbers(0) = 6
    numbers(1) = 5
    numbers(2) = 4
    numbers(3) = 3

    insertionSort(numbers)

  }


}
