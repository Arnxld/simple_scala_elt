package de.pedroarnold.sparkscala.ingestion

import org.apache.spark.sql.{DataFrame, SparkSession}

object CsvReader {

  def read(
            spark: SparkSession,
            path: String
          ): DataFrame =
    spark.read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv(path)
}