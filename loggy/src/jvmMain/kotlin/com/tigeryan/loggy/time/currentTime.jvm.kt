package com.tigeryan.loggy.time

import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

internal actual val currentTime: Duration
    get() = System.currentTimeMillis().milliseconds
