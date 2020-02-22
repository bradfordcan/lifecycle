package com.example.desserttimer

import android.app.Application
import timber.log.Timber

class DessertTimerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}