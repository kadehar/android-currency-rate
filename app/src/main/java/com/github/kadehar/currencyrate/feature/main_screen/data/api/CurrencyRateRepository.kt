package com.github.kadehar.currencyrate.feature.main_screen.data.api

import com.github.kadehar.currencyrate.feature.main_screen.domain.model.CurrencyRate

interface CurrencyRateRepository {
    suspend fun fetchRates(date: String): CurrencyRate
}