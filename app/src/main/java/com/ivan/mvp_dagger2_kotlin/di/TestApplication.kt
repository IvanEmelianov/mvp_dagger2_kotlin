package com.ivan.mvp_dagger2_kotlin.di

import android.annotation.SuppressLint
import com.ivan.mvp_dagger2_kotlin.di.componet.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

@SuppressLint("Registered")
class TestApplication : DaggerApplication() {

    override fun onCreate()  = super.onCreate()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().application(this).build()
}