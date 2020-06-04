package com.mong2s.mvvm.di

import com.mong2s.mvvm.data.remote.api.SearchAPI
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(SearchAPI::class.java) }
}