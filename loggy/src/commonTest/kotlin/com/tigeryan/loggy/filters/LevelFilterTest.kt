package com.tigeryan.loggy.filters

import com.tigeryan.loggy.Level
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LevelFilterTest {

    @Test
    fun `shouldLog with lower level returns false`() {
        val filter = LevelFilter(Level.Debug)

        val actualShouldLog = filter.shouldLog("", Level.Verbose)

        assertFalse(actualShouldLog)
    }

    @Test
    fun `shouldLog with bigger level returns true`() {
        val filter = LevelFilter(Level.Debug)

        val actualShouldLog = filter.shouldLog("", Level.Info)

        assertTrue(actualShouldLog)
    }

    @Test
    fun `shouldLog with same level returns true`() {
        val filter = LevelFilter(Level.Debug)

        val actualShouldLog = filter.shouldLog("", Level.Debug)

        assertTrue(actualShouldLog)
    }
}
