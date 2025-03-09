package com.tigeryan.loggy

public class Loggy : Logger {

    public var filter: LogFilter = Nothing

    public var formatter: LogFormatter = Nothing

    public var printer: LogPrinter = Nothing

    public override fun log(message: String, level: Level, cause: Throwable?) {
        if (filter.shouldLog(message, level, cause)) {
            printer.print(formatter.format(message, level, cause))
        }
    }
}
