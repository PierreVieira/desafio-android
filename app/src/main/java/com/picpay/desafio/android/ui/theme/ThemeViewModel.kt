package com.picpay.desafio.android.ui.theme

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThemeViewModel : ViewModel() {
    private val _theme = MutableLiveData(ThemePreferences.getTheme())
    val themeType get() = _theme

    private fun setTheme(themeType: ThemeType) {
        if (_theme.value != themeType) {
            _theme.value = themeType
        }
    }

    fun toggleTheme() = when (_theme.value) {
        ThemeType.DARK -> setTheme(ThemeType.LIGHT)
        ThemeType.LIGHT -> setTheme(ThemeType.DARK)
        else -> throw IllegalStateException("Theme is undefined")
    }

}