package com.ivan.mvp_dagger2_kotlin.presentation.test_fragment

import com.arellomobile.mvp.InjectViewState
import com.ivan.mvp_dagger2_kotlin.presentation.base.mvp.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class TestPresenter(
    private val router : Router
) : BasePresenter<TestView>(){



}