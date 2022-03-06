package com.github.kadehar.currencyrate

import android.app.Application
import com.github.kadehar.currencyrate.base.di.navigationModule
import com.github.kadehar.currencyrate.base.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CurrencyRateApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@CurrencyRateApp)
            modules(
                networkModule, navigationModule
            )
        }
    }
}