package com.tigeryan.loggy

public sealed class Level(private val value: Int) : Comparable<Level> {

    override fun compareTo(other: Level): Int {
        return this.value.compareTo(other.value)
    }

    public data object Verbose : Level(0)

    public data object Debug : Level(1)

    public data object Info : Level(2)

    public data object Warning : Level(3)

    public data object Error : Level(4)

    public data object Fatal : Level(5)
}
