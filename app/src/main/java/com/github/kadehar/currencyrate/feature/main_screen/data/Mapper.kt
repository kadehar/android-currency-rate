package com.github.kadehar.currencyrate.feature.main_screen.data

import com.github.kadehar.currencyrate.feature.main_screen.data.api.model.CurrencyRateRemote
import com.github.kadehar.currencyrate.feature.main_screen.domain.model.CurrencyRate

fun CurrencyRateRemote.toDomain(): CurrencyRate =
    CurrencyRate(
        charCode = charCode,
        value = value
    )