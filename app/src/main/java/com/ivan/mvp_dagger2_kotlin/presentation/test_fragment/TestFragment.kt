package com.ivan.mvp_dagger2_kotlin.presentation.test_fragment

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.ivan.mvp_dagger2_kotlin.R
import com.ivan.mvp_dagger2_kotlin.presentation.base.fragment.BaseFragment
import dagger.Lazy
import javax.inject.Inject

class TestFragment : BaseFragment(), TestView {

    override val layoutRes = R.layout.test_fragment

    @Inject
    lateinit var daggerPresenter: Lazy<TestPresenter>

    @InjectPresenter
    lateinit var presenter: TestPresenter

    @ProvidePresenter
    fun providePresenter(): TestPresenter = daggerPresenter.get()

    override fun initView() {

    }

}