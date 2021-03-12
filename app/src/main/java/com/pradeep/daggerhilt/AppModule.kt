package com.pradeep.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class) // This is application component
object AppModule {

    @Singleton // this works only for application component
    @Provides
    @Named("String1")
    fun provideString1() = "This is provided string1"


}