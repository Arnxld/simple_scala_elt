package de.pedroarnold.sparkscala.config

import org.apache.spark.sql.SparkSession

object SparkSessionFactory {
  def createSparkSession(appName: String): SparkSession =
    SparkSession.builder()
      .appName(appName)
      .master("local[*]")
      .getOrCreate()
}