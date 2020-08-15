package com.ivan.mvp_dagger2_kotlin.presentation.test_fragment

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.ivan.mvp_dagger2_kotlin.presentation.base.mvp.BaseView

@StateStrategyType(AddToEndSingleStrategy::class)
interface TestView : BaseView {
}