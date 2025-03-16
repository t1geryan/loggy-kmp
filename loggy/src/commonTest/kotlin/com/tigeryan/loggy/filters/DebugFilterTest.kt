package com.tigeryan.loggy.filters

import com.tigeryan.loggy.Level
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DebugFilterTest {

    @Test
    fun `shouldLog with lower level and in release returns false`() {
        val filter = DebugFilter(level = Level.Debug, isInDebug = false)

        val actualShouldLog = filter.shouldLog("", Level.Verbose)

        assertFalse(actualShouldLog)
    }

    @Test
    fun `shouldLog with same level and in release returns false`() {
        val filter = DebugFilter(level = Level.Debug, isInDebug = false)

        val actualShouldLog = filter.shouldLog("", Level.Debug)

        assertFalse(actualShouldLog)
    }

    @Test
    fun `shouldLog with bigger level and in release returns false`() {
        val filter = DebugFilter(level = Level.Debug, isInDebug = false)

        val actualShouldLog = filter.shouldLog("", Level.Info)

        assertFalse(actualShouldLog)
    }

    @Test
    fun `shouldLog with lower level and in debug returns false`() {
        val filter = DebugFilter(level = Level.Debug, isInDebug = false)

        val actualShouldLog = filter.shouldLog("", Level.Verbose)

        assertFalse(actualShouldLog)
    }

    @Test
    fun `shouldLog with same level and in debug returns true`() {
        val filter = DebugFilter(level = Level.Debug, isInDebug = true)

        val actualShouldLog = filter.shouldLog("", Level.Debug)

        assertTrue(actualShouldLog)
    }

    @Test
    fun `shouldLog with bigger level and in debug returns true`() {
        val filter = DebugFilter(level = Level.Debug, isInDebug = true)

        val actualShouldLog = filter.shouldLog("", Level.Info)

        assertTrue(actualShouldLog)
    }
}
