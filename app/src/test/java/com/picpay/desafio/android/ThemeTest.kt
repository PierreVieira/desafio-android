package com.picpay.desafio.android

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.picpay.desafio.android.ui.theme.ThemeType
import com.picpay.desafio.android.ui.theme.ThemeViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ThemeTest {
    private lateinit var themeViewModel: ThemeViewModel
    private val currentThemeViewModel get() = themeViewModel.themeType.value

    @Mock
    private lateinit var themeObserver: Observer<ThemeType>

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        themeViewModel = ThemeViewModel()
        themeViewModel.themeType.observeForever(themeObserver)
    }

    @Test
    fun testDefaultTheme() {
        val expectedTheme = ThemeType.DARK
        checkTheme(expectedTheme, currentThemeViewModel)
    }

    // Please don't use repeat here (because @Before)
    @Test
    fun testOneToggle() = executeCheckToggle(1)
    @Test
    fun testTwoToggle() = executeCheckToggle(2)
    @Test
    fun testThreeToggle() = executeCheckToggle(3)
    @Test
    fun tesFourToggle() = executeCheckToggle(4)

    private fun executeCheckToggle(numberToggles: Int) {
        val expected = if (numberToggles.isEven()) ThemeType.DARK else ThemeType.LIGHT
        repeat(numberToggles) { themeViewModel.toggleTheme() }
        val resulted = currentThemeViewModel
        checkThemeToggle(expected, resulted, numberToggles)
    }

    private fun checkThemeToggle(expected: ThemeType, resulted: ThemeType?, numberToggles: Int) {
        try {
            checkTheme(expected, resulted)
        } catch (e: AssertionError) {
            val message = "Number toggles: $numberToggles\n${e.message}"
            throw AssertionError(message)
        }
    }

    private fun checkTheme(expected: ThemeType, resulted: ThemeType?) {
        resulted?.let {
            if (expected != it) {
                throw AssertionError("Different themes.\nExpected: ${expected.name}\nResulted: ${it.name}")
            }
        } ?: throw AssertionError("Resulted theme is null.")
    }

    private fun Int.isEven() = this % 2 == 0
}