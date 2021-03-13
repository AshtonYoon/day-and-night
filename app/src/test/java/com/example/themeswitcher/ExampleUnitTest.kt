package com.example.themeswitcher

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun safeEnum(){
        val theme = Theme.NoTheme

        val num = when(theme){
            Theme.Light -> 0
            Theme.Dark -> 1
            else -> 2
        }.safe()

        print(num)
    }

    private fun <T> T.safe() = this

    enum class Theme {
        Light,
        Dark,
        NoTheme
    }
}