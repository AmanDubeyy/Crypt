package com.plcoding.cryptocurrencyappyt.domain.model

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin : CoinDetail? = null,
    val error: String = ""
)