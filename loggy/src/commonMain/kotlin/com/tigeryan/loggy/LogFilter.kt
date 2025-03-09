package com.tigeryan.loggy

public interface LogFilter {

    public fun shouldLog(message: String, level: Level, cause: Throwable?): Boolean
}
