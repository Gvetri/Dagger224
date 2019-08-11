package com.codingpizza.daggertest.di

import com.codingpizza.daggertest.data.DataSource
import com.codingpizza.daggertest.data.DummyService
import com.codingpizza.daggertest.data.LocalSource
import com.codingpizza.daggertest.data.NetworkSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton
import javax.xml.transform.Source


//Object because it's optimal
@Module
object ApiServiceModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideDummyService(
        @Named("local") localSource: DataSource,
        @Named("network") networkSource: DataSource
    ): DummyService {
        return DummyService(localSource, networkSource)
    }
}