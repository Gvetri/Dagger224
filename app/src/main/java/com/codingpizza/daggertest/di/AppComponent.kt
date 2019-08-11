package com.codingpizza.daggertest.di

import com.codingpizza.daggertest.YourApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [AndroidInjectionModule::class, ViewModelModule::class, ApiServiceModule::class, ActivityModule::class, FragmentModule::class, BindModule::class]
)
interface AppComponent {
    fun inject(application: YourApplication)
}