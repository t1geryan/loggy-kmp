package com.tigeryan.loggy.formatters

import com.tigeryan.loggy.Level
import com.tigeryan.loggy.LogFormatter
import com.tigeryan.loggy.time.currentTime

public class SimpleFormatter(private val printTime: Boolean = false) : LogFormatter {

    override fun format(message: String, level: Level, cause: Throwable?): List<String> {
        val errorString = cause?.let { "  ERROR: ${it.message ?: it.toString()}" } ?: ""
        val timeString = if (printTime) "TIME: ${currentTime.toIsoString()}" else ""

        val formattedMessage = "$timeString ${getLevelPrefix(level)} $message$errorString"

        return listOf(formattedMessage)
    }

    private fun getLevelPrefix(level: Level) = when (level) {
        Level.Verbose -> "[V]"
        Level.Debug -> "[D]"
        Level.Info -> "[I]"
        Level.Warning -> "[W]"
        Level.Error -> "[E]"
        Level.Fatal -> "[WTF]"
    }
}
