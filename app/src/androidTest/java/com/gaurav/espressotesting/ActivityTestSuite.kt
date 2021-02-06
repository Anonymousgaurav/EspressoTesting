package com.gaurav.espressotesting

import org.junit.runner.RunWith
import org.junit.runners.Suite



// running all the test at one time

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SecondaryActivityTest::class
)
class ActivityTestSuite {
}