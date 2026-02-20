package de.pedroarnold.sparkscala

import de.pedroarnold.sparkscala.config.SparkSessionFactory

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSessionFactory.createSparkSession("sparkScalaApp")

    val beverageSalesDf = spark.read
      .option("header", value = true)
      .csv("data/beverage_sales.csv")

    val beverageChannelGroup_df = spark.read
      .option("header", value = true)
      .csv("data/beverage_channel_group.csv")

    val joined_df = beverageSalesDf.join(
      beverageChannelGroup_df,
      Seq("TRADE_CHNL_DESC"),
      "left"
    )
  }
}

