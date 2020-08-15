package com.ivan.mvp_dagger2_kotlin.util

interface Mapper<FROM, TO> {
    fun transform(value: FROM): TO
}