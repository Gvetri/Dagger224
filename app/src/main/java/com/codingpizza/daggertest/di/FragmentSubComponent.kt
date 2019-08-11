package com.codingpizza.daggertest.di

import com.codingpizza.daggertest.ui.home.HomeFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface FragmentSubComponent : AndroidInjector<HomeFragment> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<HomeFragment>
}