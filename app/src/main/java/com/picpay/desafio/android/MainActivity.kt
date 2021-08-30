package com.picpay.desafio.android

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.picpay.desafio.android.ui.theme.ThemePreferences
import com.picpay.desafio.android.ui.theme.ThemeViewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var navController: NavController
    val themeViewModel: ThemeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ThemePreferences.initialize(this)
        setupNavigation()
        setupThemeObserver()
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp() = navController.navigateUp() || super.onSupportNavigateUp()

    private fun setupThemeObserver() {
        themeViewModel.themeType.observe(this) { theme ->
            ThemePreferences.saveTheme(theme)
            AppCompatDelegate.setDefaultNightMode(theme.compatDelegate)
        }
    }
}
