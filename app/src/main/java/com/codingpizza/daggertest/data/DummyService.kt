package com.codingpizza.daggertest.data

import android.util.Log
import javax.inject.Inject

class DummyService @Inject constructor(val localSource: DataSource, val networkSource: DataSource) {
    fun returnData(): String {
        Log.d("Dummy Service", "local = ${localSource.doSomething()}")
        Log.d("Dummy Service", "network = ${networkSource.doSomething()}")
        return networkSource.doSomething()
    }
}
