package com.github.kadehar.currencyrate.feature.main_screen.data.api.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Valute")
data class CurrencyRateRemote(
    @Element(name = "CharCode")
    val charCode: String,
    @Element(name = "Value")
    val value: Double
)
