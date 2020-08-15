package com.ivan.mvp_dagger2_kotlin.di.componet

import com.ivan.mvp_dagger2_kotlin.di.TestApplication
import com.ivan.mvp_dagger2_kotlin.di.module.*
import com.ivan.mvp_dagger2_kotlin.presentation.app.AppScreanModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidInjectionModule::class,

    ActivityBuilder::class,
    AppModule::class,
    FragmentModule::class,
    NavigationModule::class,
    NetworkModule::class,
    RepositoryModule::class,

    AppScreanModule::class
])

interface AppComponent : AndroidInjector<TestApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TestApplication): Builder

        fun build(): AppComponent
    }
}