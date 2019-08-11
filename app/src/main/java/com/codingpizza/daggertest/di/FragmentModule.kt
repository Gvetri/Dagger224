package com.codingpizza.daggertest.di

import com.codingpizza.daggertest.ui.dashboard.DashboardFragment
import com.codingpizza.daggertest.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector(modules = [])
    abstract fun provideHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun provideDashboardFragment(): DashboardFragment
}
