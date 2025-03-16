package com.tigeryan.loggy.test

import com.tigeryan.loggy.Level
import com.tigeryan.loggy.Logger

public class TestLoggy : Logger {

    override fun log(message: String, level: Level, cause: Throwable?) {
        // test logger does nothing
    }
}