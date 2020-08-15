package com.ivan.mvp_dagger2_kotlin.di.module

import com.ivan.mvp_dagger2_kotlin.presentation.app.AppActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder{

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun bindAppActivity(): AppActivity
}