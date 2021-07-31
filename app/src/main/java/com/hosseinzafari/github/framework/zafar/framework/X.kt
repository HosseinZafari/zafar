package com.hosseinzafari.github.framework.zafar.framework

import android.app.Application

/*
    @created in 31/07/2021 - 10:51 AM
    @project ZafarFramework
    @author Hossein Zafari
    @email  hosseinzafari2000@gmail.com
*/

class X : Application() {

    override fun onCreate() {
        super.onCreate()

        Debug.LEVEL = LOG_LEVEL.ERROR
        Debug.LOG_TAG = "HodHod"
    }

}