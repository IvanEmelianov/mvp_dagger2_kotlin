package com.ivan.mvp_dagger2_kotlin.di.module

import com.ivan.mvp_dagger2_kotlin.presentation.test_fragment.TestFragment
import com.ivan.mvp_dagger2_kotlin.presentation.test_fragment.TestModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector(modules = [TestModule::class])
    abstract fun bindTestFragment(): TestFragment
}