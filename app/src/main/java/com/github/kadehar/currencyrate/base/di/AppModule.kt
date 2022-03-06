package com.github.kadehar.currencyrate.base.di

import com.github.kadehar.currencyrate.base.constants.Constants.BASE_URL
import com.github.kadehar.currencyrate.base.network.okHttpClient
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

val networkModule = module {
    single<OkHttpClient> {
        okHttpClient()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(get<OkHttpClient>())
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
    }
}

val navigationModule = module {
    single<Cicerone<Router>> {
        Cicerone.create(Router())
    }

    single<NavigatorHolder> {
        get<Cicerone<Router>>().getNavigatorHolder()
    }

    single<Router> {
        get<Cicerone<Router>>().router
    }
}