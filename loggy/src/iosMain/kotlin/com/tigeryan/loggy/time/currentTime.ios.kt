package com.tigeryan.loggy.time

import platform.Foundation.*
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

internal actual val currentTime: Duration
    get() = (NSDate().timeIntervalSince1970 * 1000).toLong().milliseconds
