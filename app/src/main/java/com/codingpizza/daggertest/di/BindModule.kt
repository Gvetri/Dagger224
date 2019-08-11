package com.codingpizza.daggertest.di

import com.codingpizza.daggertest.data.DataSource
import com.codingpizza.daggertest.data.LocalSource
import com.codingpizza.daggertest.data.NetworkSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class BindModule {

    @Named("local")
    @Binds
    abstract fun provideLocalDummyService(localSource: LocalSource): DataSource

    @Named("network")
    @Binds
    abstract fun provideNetworkDummyService(networkSource: NetworkSource): DataSource

}
