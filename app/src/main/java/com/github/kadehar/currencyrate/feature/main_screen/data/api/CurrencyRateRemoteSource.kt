package com.github.kadehar.currencyrate.feature.main_screen.data.api

class CurrencyRateRemoteSource(private val currencyRateApi: CurrencyRateApi) {
    suspend fun fetchRates(date: String) = currencyRateApi.fetchRates(date = date)
}