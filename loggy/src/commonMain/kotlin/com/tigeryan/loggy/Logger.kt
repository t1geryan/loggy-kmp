package com.tigeryan.loggy

public interface Logger {

    public fun d(message: String, cause: Throwable?): Unit =
        log(message, Level.DEBUG, cause)

    public fun v(message: String, cause: Throwable?): Unit =
        log(message, Level.VERBOSE, cause)

    public fun i(message: String, cause: Throwable?): Unit =
        log(message, Level.INFO, cause)

    public fun w(message: String, cause: Throwable?): Unit =
        log(message, Level.WARNING, cause)

    public fun e(message: String, cause: Throwable?): Unit =
        log(message, Level.ERROR, cause)

    public fun f(message: String, cause: Throwable?): Unit =
        log(message, Level.FATAL, cause)

    public fun log(message: String, level: Level, cause: Throwable?)
}
