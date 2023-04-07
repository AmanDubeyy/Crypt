package com.plcoding.cryptocurrencyappyt.domain.model

data class Coin(
    val Coin_id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)
