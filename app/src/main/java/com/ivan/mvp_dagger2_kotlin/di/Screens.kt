package com.ivan.mvp_dagger2_kotlin.di

import androidx.fragment.app.Fragment
import com.ivan.mvp_dagger2_kotlin.presentation.test_fragment.TestFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object TestScreen : SupportAppScreen() {
        override fun getFragment(): Fragment
                = TestFragment()
    }
}