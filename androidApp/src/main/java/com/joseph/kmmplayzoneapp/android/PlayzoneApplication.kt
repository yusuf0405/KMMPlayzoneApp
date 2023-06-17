package com.joseph.kmmplayzoneapp.android

import PlatformConfiguration
import PlatformSDK
import android.app.Application

class PlayzoneApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initPlatformSDK()
    }
}

fun PlayzoneApplication.initPlatformSDK() = PlatformSDK.init(
    configuration = PlatformConfiguration(androidContext = applicationContext)
)