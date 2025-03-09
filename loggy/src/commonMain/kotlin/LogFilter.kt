abstract class LogFilter {

    abstract fun shouldLog(message: String, level: Level, cause: Throwable?): Boolean
}
