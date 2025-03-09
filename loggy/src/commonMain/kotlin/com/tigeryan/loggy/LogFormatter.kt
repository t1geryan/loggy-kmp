package com.tigeryan.loggy

public interface LogFormatter {

    public fun format(message: String, level: Level, cause: Throwable?): List<String>
}