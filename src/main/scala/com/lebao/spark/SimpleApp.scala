package com.lebao.spark

import org.apache.spark.sql.SparkSession


object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "file://C:/work/tools/spark/spark-3.1.3-bin-hadoop3.2/README.md" // Should be some file on your system
//    val spark = SparkSession.builder.appName("Simple Application").master("local").getOrCreate()
val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}