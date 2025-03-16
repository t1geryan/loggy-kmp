package com.tigeryan.loggy.printers

import com.tigeryan.loggy.Level

internal actual fun rawConsolePrint(level: Level, message: String) {
    println(message)
}
