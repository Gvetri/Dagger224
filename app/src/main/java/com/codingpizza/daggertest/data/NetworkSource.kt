package com.codingpizza.daggertest.data

import android.util.Log
import javax.inject.Inject

class NetworkSource @Inject constructor() : DataSource {
    override fun doSomething() : String{
        Log.d("NetworkSource", "Doing something network")
        return "network"
    }
}