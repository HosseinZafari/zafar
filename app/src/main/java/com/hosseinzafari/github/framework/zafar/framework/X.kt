package com.hosseinzafari.github.framework.zafar.framework

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.hosseinzafari.github.framework.zafar.framework.lang.EnLang
import com.hosseinzafari.github.framework.zafar.framework.lang.FaLang
import com.hosseinzafari.github.framework.zafar.framework.lang.Lang

/*
    @created in 31/07/2021 - 10:51 AM
    @project ZafarFramework
    @author Hossein Zafari
    @email  hosseinzafari2000@gmail.com
*/

/*
* global variable use in the application
* l variable is short language module name
* */
var l = X.lang

class X : Application() {

    companion object {
        lateinit var currentActivity: AppCompatActivity
        lateinit var lang: Lang

        fun config() {
            Debug.LEVEL = LOG_LEVEL.VERBOSE
            Debug.LOG_TAG = "HodHod"
            lang = FaLang()
        }
    }

    override fun onCreate() {
        super.onCreate()

        config()
    }

}