package com.picpay.desafio.android.ui.theme

import android.content.Context
import android.content.SharedPreferences
import com.picpay.desafio.android.ui.MainActivity

object ThemePreferences {
    private const val THEME_KEY = "theme_key"
    private val defaultTheme = ThemeType.DARK
    private var sharedPreferences: SharedPreferences? = null

    fun initialize(activity: MainActivity) {
        if (sharedPreferences == null) {
            sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        }
    }

    fun saveTheme(themeType: ThemeType) {
        sharedPreferences?.let {
            with(it.edit()) {
                putInt(THEME_KEY, themeType.compatDelegate).apply()
            }
        } ?: throw IllegalStateException("Shared preferences is null when try save theme")
    }

    fun getTheme() = sharedPreferences?.let {
        when (it.getInt(THEME_KEY, defaultTheme.compatDelegate)) {
            ThemeType.LIGHT.compatDelegate -> ThemeType.LIGHT
            else -> ThemeType.DARK
        }
    } ?: defaultTheme
}