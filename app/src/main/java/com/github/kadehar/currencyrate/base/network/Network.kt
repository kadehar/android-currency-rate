package com.github.kadehar.currencyrate.base.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

fun okHttpClient(): OkHttpClient =
    OkHttpClient.Builder().addInterceptor(loggingInterceptor()).build()

private fun loggingInterceptor() = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}