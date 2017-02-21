package com.huahua.com.huahua.util

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

}
