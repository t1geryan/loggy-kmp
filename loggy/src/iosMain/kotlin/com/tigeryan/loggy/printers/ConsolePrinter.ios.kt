package com.tigeryan.loggy.printers

import com.tigeryan.loggy.Level
import platform.Foundation.NSLog

internal actual fun rawConsolePrint(level: Level, message: String) {
    NSLog(message)
}
