package com.github.kadehar.currencyrate.feature.main_screen.data.api

import com.github.kadehar.currencyrate.base.constants.Constants.BASE_PATH
import com.github.kadehar.currencyrate.feature.main_screen.data.api.model.CurrencyRateRemote
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyRateApi {
    @GET(value = BASE_PATH)
    suspend fun fetchRates(
        @Query("date_req") date: String
    ): CurrencyRateRemote
}