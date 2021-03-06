package com.hosseinzafari.github.framework.zafar.framework

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

/*
    @created in 31/07/2021 - 2:07 PM
    @project ZafarFramework
    @author Hossein Zafari
    @email  hosseinzafari2000@gmail.com
*/

abstract class XActivity : AppCompatActivity(){

    override fun onStart() {
        super.onStart()
        Debug.verbose("${this::class.java.simpleName} OnStarted")
        X.currentActivity = this
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        X.currentActivity = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Debug.verbose("${this::class.java.simpleName} OnCreated")
        X.currentActivity = this
    }

    override fun onResume() {
        super.onResume()
        Debug.verbose("${this::class.java.simpleName} OnResume")
        X.currentActivity = this
    }

    override fun onPause() {
        super.onPause()
        Debug.verbose("${this::class.java.simpleName} OnPause")
    }

    override fun onRestart() {
        super.onRestart()
        Debug.verbose("${this::class.java.simpleName} OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Debug.verbose("${this::class.java.simpleName} OnDestroy")
    }
}