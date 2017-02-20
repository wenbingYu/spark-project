package com.huahua.spark.example

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by yuwenbing on 17/2/20.
 */
object SparkLocalOrcExample {


  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("WordCount1").setMaster("local")
    val sc = new SparkContext(conf)
    sc.textFile("file:///Users/yuwenbing/aa.txt").flatMap(_.split(" ")).map(x => (x, 1)).reduceByKey(_ + _).foreach(println)
    sc.stop()

  }

}
