package com.ivan.mvp_dagger2_kotlin.di.module

import com.ivan.mvp_dagger2_kotlin.di.TestApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: TestApplication)
            = application.applicationContext!!

}