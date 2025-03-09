abstract class LogFormatter {

    abstract fun format(message: String, level: Level, cause: Throwable?): List<String>
}
