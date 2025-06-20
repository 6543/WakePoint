/*
 * Copyright (C) 2018 George Stavrinos (Unlicense)
 * Copyright (C) 2025-present 6543 (GPL-3.0-or-later)
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package gstavrinos.destinationalarm

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("gstavrinos.destinationalarm", appContext.packageName)
    }
}
