public abstract class LogFilter {

    public abstract fun shouldLog(message: String, level: Level, cause: Throwable?): Boolean
}
