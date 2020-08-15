package com.ivan.mvp_dagger2_kotlin.presentation.test_fragment

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Router

@Module
class TestModule {

    @Provides
    fun providePresenter(router: Router): TestPresenter
            = TestPresenter(router)
}