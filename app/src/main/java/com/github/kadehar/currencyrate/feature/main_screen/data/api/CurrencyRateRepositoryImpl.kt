package com.github.kadehar.currencyrate.feature.main_screen.data.api

import com.github.kadehar.currencyrate.feature.main_screen.data.toDomain
import com.github.kadehar.currencyrate.feature.main_screen.domain.model.CurrencyRate

class CurrencyRateRepositoryImpl(private val source: CurrencyRateRemoteSource)
    : CurrencyRateRepository {
    override suspend fun fetchRates(date: String): CurrencyRate {
        return source.fetchRates(date = date).toDomain()
    }
}