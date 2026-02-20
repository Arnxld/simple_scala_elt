package de.pedroarnold.sparkscala.model.silver

import java.time.LocalDate

case class BeverageSale(
                       date: LocalDate,
                       ce_brand_flvr: Int,
                       brand_name: String,
                       btlr_org_lvl: String,
                       channel_group: String,
                       trade_channel_desc: String,
                       pkg_cat: String,
                       pkg_cat_desc: String,
                       tsr_pckg_nm: String,
                       volume: Float,
                       year: Int,
                       month: Int,
                       period: Int
                       )