package com.codingpizza.daggertest.di

import com.codingpizza.daggertest.ui.MainActivity
import com.codingpizza.daggertest.ui.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun provideSecondActivity(): SecondActivity
}
