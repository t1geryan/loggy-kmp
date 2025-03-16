package com.tigeryan.loggy.filters

import com.tigeryan.loggy.Level
import com.tigeryan.loggy.LogFilter

public class DebugFilter(private val level: Level, private val isInDebug: Boolean) : LogFilter {
    override fun shouldLog(message: String, level: Level, cause: Throwable?): Boolean {
        return isInDebug && level >= this.level
    }
}
