package com.tigeryan.loggy

public interface Logger {

    public fun d(message: String, cause: Throwable?): Unit =
        log(message, Level.Debug, cause)

    public fun v(message: String, cause: Throwable?): Unit =
        log(message, Level.Verbose, cause)

    public fun i(message: String, cause: Throwable?): Unit =
        log(message, Level.Info, cause)

    public fun w(message: String, cause: Throwable?): Unit =
        log(message, Level.Warning, cause)

    public fun e(message: String, cause: Throwable?): Unit =
        log(message, Level.Error, cause)

    public fun f(message: String, cause: Throwable?): Unit =
        log(message, Level.Fatal, cause)

    public fun log(message: String, level: Level, cause: Throwable?)
}
