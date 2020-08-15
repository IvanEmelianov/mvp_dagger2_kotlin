package com.ivan.mvp_dagger2_kotlin.presentation.app

import com.arellomobile.mvp.InjectViewState
import com.ivan.mvp_dagger2_kotlin.di.Screens
import com.ivan.mvp_dagger2_kotlin.presentation.base.mvp.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class AppPresenter(
    private val router: Router
) : BasePresenter<AppView>() {

    fun beginWork(){
        router.newRootChain(Screens.TestScreen)
    }
}