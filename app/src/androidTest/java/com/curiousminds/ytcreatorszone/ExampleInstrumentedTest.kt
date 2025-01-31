package com.curiousminds.ytcreatorszone

import androidx.test.platform.SocialX.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

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
        // Context of the SocialX under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.itandcstech.releifpay", appContext.packageName)
    }
}