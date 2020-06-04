package com.mong2s.mvvm.di

import com.mong2s.mvvm.data.db.AppDB
import org.koin.dsl.module
import org.koin.android.ext.koin.androidApplication

val DBModule = module {
    single { AppDB.getInstance(androidApplication()) }
    single { get<AppDB>().getBookmarkDao() }
}