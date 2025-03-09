public abstract class LogFormatter {

    public abstract fun format(message: String, level: Level, cause: Throwable?): List<String>
}