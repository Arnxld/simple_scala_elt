package de.pedroarnold.sparkscala

import de.pedroarnold.sparkscala.config.SparkSessionFactory
import de.pedroarnold.sparkscala.ingestion.CsvReader


object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSessionFactory.createSparkSession("sparkScalaApp")

    val beverageSalesDfBronze = CsvReader.read(spark, "data/beverage_sales.csv")
    val beverageChannelGroupDfBronze = CsvReader.read(spark, "data/beverage_channel_group.csv")



    val joined_df = beverageSalesDf.join(
      beverageChannelGroup_df,
      Seq("TRADE_CHNL_DESC"),
      "left"
    )
  }
}

