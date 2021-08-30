package com.picpay.desafio.android.ui.theme

import androidx.appcompat.app.AppCompatDelegate

enum class ThemeType(val compatDelegate: Int) {
    DARK(AppCompatDelegate.MODE_NIGHT_YES), LIGHT(AppCompatDelegate.MODE_NIGHT_NO)
}