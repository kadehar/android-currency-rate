package com.github.kadehar.currencyrate.feature.main_screen.data.api

interface CurrencyRateRepository {
    suspend fun fetchRates(date: String): CurrencyRate
}