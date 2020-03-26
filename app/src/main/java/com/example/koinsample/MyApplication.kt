package com.example.koinsample

import android.app.Application
import com.example.koinsample.di.repositoryModule
import com.example.koinsample.di.teamModule
import com.example.koinsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //this is how we start koin ,it must include the androidContext and also all the modules
        startKoin {
            androidContext(this@MyApplication)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(teamModule)
        }

        //setting up timber
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}