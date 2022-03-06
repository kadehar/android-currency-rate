package com.github.kadehar.currencyrate.feature.main_screen.data

import com.github.kadehar.currencyrate.feature.main_screen.data.api.model.CurrencyRateRemote

fun CurrencyRateRemote.toDomain(): CurrencyRate =
    CurrencyRate(
        charCode = charCode,
        value = value
    )