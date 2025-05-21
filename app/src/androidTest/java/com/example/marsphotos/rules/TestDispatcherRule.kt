package com.example.marsphotos.rules

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.rules.TestWatcher
import org.junit.runner.Description

/* the main goal of this test rule is to replace the Main dispatcher with a test dispatcher before test begins to execute
* https://developer.android.com/codelabs/basic-a
* ndroid-kotlin-compose-add-repository?con
* tinue=https%3A%2F%2Fdeveloper.android.com
* %2Fcourses%2Fpathways%2Fandroid-basics-com
* pose-unit-5-pathway-2%23codelab-https%3A%2F
* %2Fdeveloper.android.com%2Fcodelabs%2Fbasic-a
* ndroid-kotlin-compose-add-repository#9 */

class TestDispatcherRule(private val testDispatcher: TestDispatcher = UnconfinedTestDispatcher()) :
        TestWatcher() {
    override fun starting(description: Description) {
        Dispatchers.setMain(testDispatcher)
    }
    
    override fun finished(description: Description) {
        Dispatchers.resetMain()
    }
}
/* test dispatcher rule is now ready to be used */

