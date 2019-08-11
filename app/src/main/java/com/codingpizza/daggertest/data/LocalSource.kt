package com.codingpizza.daggertest.data

import android.util.Log
import javax.inject.Inject

class LocalSource @Inject constructor() : DataSource {
    override fun doSomething(): String {
        Log.d("LocalSource", "Doing something locally")
        return "Local"
    }
}