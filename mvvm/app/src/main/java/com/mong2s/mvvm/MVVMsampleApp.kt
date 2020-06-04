package com.mong2s.mvvm

import android.app.Application
import com.mong2s.mvvm.di.apiModule
import com.mong2s.mvvm.di.networkModule
import com.mong2s.mvvm.di.DBModule
import com.mong2s.mvvm.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MVVMApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MVVMApp)
            modules(listOf(apiModule, DBModule, networkModule, viewModelModule))
        }
    }

}