package com.tigeryan.loggy.printers

import android.util.Log
import com.tigeryan.loggy.Level

// TODO: made tag customizable
internal actual fun rawConsolePrint(level: Level, message: String) {
    Log.println(level.androidValue, "loggy", message)
}

private val Level.androidValue: Int
    get() = when(this) {
        Level.Verbose -> Log.VERBOSE
        Level.Debug -> Log.DEBUG
        Level.Info -> Log.INFO
        Level.Warning -> Log.WARN
        Level.Error -> Log.ERROR
        Level.Fatal -> Log.ASSERT
    }
