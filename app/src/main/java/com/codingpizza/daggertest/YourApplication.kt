package com.codingpizza.daggertest

import android.app.Application
import com.codingpizza.daggertest.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject



class YourApplication : Application(), HasAndroidInjector {
    @set:Inject
    var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>? = null

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create()
            .inject(this)
    }
    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector!!
    }

}