package com.tigeryan.loggy.time

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import platform.posix.gettimeofday
import platform.posix.timeval
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@OptIn(ExperimentalForeignApi::class)
internal actual val currentTime: Duration
    get() = memScoped {
        val timeVal = alloc<timeval>()
        gettimeofday(timeVal.ptr, null)
        val milliseconds = timeVal.tv_sec * 1000L + timeVal.tv_usec / 1000L
        milliseconds.milliseconds
    }
