package com.codingpizza.daggertest.ui

import android.os.Bundle
import com.codingpizza.daggertest.R
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity

class SecondActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
