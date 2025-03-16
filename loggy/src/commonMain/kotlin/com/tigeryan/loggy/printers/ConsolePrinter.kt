package com.tigeryan.loggy.printers

import com.tigeryan.loggy.Level
import com.tigeryan.loggy.LogPrinter

internal expect fun rawConsolePrint(level: Level, message: String)

public class ConsolePrinter: LogPrinter {

    override fun print(level: Level, lines: List<String>) {
        lines.forEach { line ->
            rawConsolePrint(level, line)
        }
    }
}
