package com.tigeryan.loggy.filters

import com.tigeryan.loggy.Level
import com.tigeryan.loggy.LogFilter

public class LevelFilter(
    private val level: Level,
) : LogFilter {

    override fun shouldLog(message: String, level: Level, cause: Throwable?): Boolean {
        return level >= this.level
    }
}
