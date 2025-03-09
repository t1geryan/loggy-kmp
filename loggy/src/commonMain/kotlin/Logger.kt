class Logger {

    fun log(message: String, level: Level) {

    }

    fun d(message: String) = log(message, Level.DEBUG)

    fun v(message: String) = log(message, Level.VERBOSE)

    fun i(message: String) = log(message, Level.INFO)

    fun w(message: String) = log(message, Level.WARNING)

    fun e(message: String) = log(message, Level.ERROR)

    fun f(message: String) = log(message, Level.FATAL)
}
