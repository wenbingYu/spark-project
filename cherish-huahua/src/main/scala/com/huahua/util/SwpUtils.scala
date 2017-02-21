package com.huahua.util

/**
 * Created by yuwenbing on 17/2/21.
 *
 * @author wenbing.yu
 * @define :两个数据交换的实现
 *
 */
object SwpUtils {


  /**
   * 通过中间变量的交换
   **/
  def getIntermediateVariableSwap(array: Array[Int], x: Int, y: Int): Array[Int] = {

    val tmp = array(x)
    array(x) = array(y)
    array(y) = tmp
    array

  }

  /**
   *
   * 位运算,效率最高
   **/
  def getBitOperatorSwap(array: Array[Int], x: Int, y: Int): Array[Int] = {

    array(x) = array(x) ^ array(y)

    array(y) = array(x) ^ array(y)

    array(x) = array(x) ^ array(y)

    array

  }

  /**
   * 加减法运行交换数据,但是有可能越界
   **/
  def getlusSubSwap(array: Array[Int], x: Int, y: Int): Array[Int] = {

    array(x) = array(x) + array(y)

    array(y) = array(x) - array(y)

    array(x) = array(x) - array(y)

    array

  }


}
