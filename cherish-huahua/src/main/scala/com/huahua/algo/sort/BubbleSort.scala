package com.huahua.algo.sort

import com.huahua.util.SwpUtils

/**
 * Created by yuwenbing on 17/2/20.
 *
 * 冒泡排序算法
 */
object BubbleSort {


  def BubbleSort(array: Array[Int]): Unit = {


    //控制循环的趟数从1到length-1   1 012  2 01 3 0
    for (i <- 1 to array.length) {

      //每一趟比较的次数 相加等于length
      for (j <- 0 to array.length - i - 1) {

        if (array(j) < array(j + 1)) {

          SwpUtils.getIntermediateVariableSwap(array, j, j + 1)
        }

      }
    }


    for (k <- 0 to array.length - 1) {
      println(array(k))
    }

  }


  def main(args: Array[String]) {

    val numbers = new Array[Int](4)
    numbers(0) = 2
    numbers(1) = 3
    numbers(2) = 4
    numbers(3) = 5

    BubbleSort(numbers)

  }

}
