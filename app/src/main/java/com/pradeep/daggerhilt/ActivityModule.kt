package com.pradeep.daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named


@Module
@InstallIn(ActivityComponent::class) // life only when main activity lives
object ActivityModule {

    @ActivityScoped // for singleton only works on activity component
    @Provides
    @Named("String2") // identification of the which object needs to inject
    fun provideString2(
        @ApplicationContext context: Context
    ) = context.getString(R.string.provide_text)

}