package com.hosseinzafari.github.framework.zafar.framework

import android.app.Application
import androidx.appcompat.app.AppCompatActivity

/*
    @created in 31/07/2021 - 10:51 AM
    @project ZafarFramework
    @author Hossein Zafari
    @email  hosseinzafari2000@gmail.com
*/

class X : Application() {

    companion object {
        lateinit var currentActivity: AppCompatActivity

        fun config() {
            Debug.LEVEL = LOG_LEVEL.VERBOSE
            Debug.LOG_TAG = "HodHod"
        }
    }

    override fun onCreate() {
        super.onCreate()

        config()
    }

}