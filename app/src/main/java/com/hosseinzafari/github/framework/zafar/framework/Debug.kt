package com.hosseinzafari.github.framework.zafar.framework

import android.util.Log

/*
    @created in 31/07/2021 - 10:59 AM
    @project ZafarFramework
    @author Hossein Zafari
    @email  hosseinzafari2000@gmail.com
*/

enum class LOG_LEVEL(val ord: Int ) {
    VERBOSE(0) ,
    DEBUG(1) ,
    INFO(2) ,
    WARN(3) ,
    ERROR(4) ,
    DISABLE(5) ,
}

class Debug {
    companion object {
        var LOG_TAG = "Test"
        var LEVEL = LOG_LEVEL.DISABLE

        fun info(message: Any) = log(LOG_LEVEL.INFO ,"" + message)
        fun warn(message: Any) = log(LOG_LEVEL.WARN , "" + message)
        fun error(message: Any) = log(LOG_LEVEL.ERROR , "" + message)
        fun debug(message: Any) = log(LOG_LEVEL.DEBUG , "" + message)
        fun verbose(message: Any) = log(LOG_LEVEL.VERBOSE , "" + message)


        private fun log(logLevel: LOG_LEVEL, message: String) {
            if(LEVEL > logLevel) {
                return
            }

            when(logLevel) {
                LOG_LEVEL.VERBOSE -> Log.v(LOG_TAG , message)
                LOG_LEVEL.DEBUG -> Log.d(LOG_TAG , message)
                LOG_LEVEL.INFO -> Log.i(LOG_TAG , message)
                LOG_LEVEL.WARN -> Log.w(LOG_TAG , message)
                LOG_LEVEL.ERROR -> Log.e(LOG_TAG , message)
            }
        }

    }

}