package com.tigeryan.loggy

import com.tigeryan.loggy.filters.LevelFilter
import com.tigeryan.loggy.formatters.SimpleFormatter
import com.tigeryan.loggy.printers.ConsolePrinter

public class Loggy(
    private val filter: LogFilter = LevelFilter(Level.Debug),
    private val formatter: LogFormatter = SimpleFormatter(),
    private val printer: LogPrinter = ConsolePrinter(),
) : Logger {

    public override fun log(message: String, level: Level, cause: Throwable?) {
        if (filter.shouldLog(message, level, cause)) {
            printer.print(level, formatter.format(message, level, cause))
        }
    }
}
