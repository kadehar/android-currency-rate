package com.github.kadehar.currencyrate.feature.main_screen.domain

import com.github.kadehar.currencyrate.feature.main_screen.data.api.CurrencyRateRepository

class CurrencyRateInteractor(private val repository: CurrencyRateRepository) {
    suspend fun fetchRates(date: String) = repository.fetchRates(date)
}