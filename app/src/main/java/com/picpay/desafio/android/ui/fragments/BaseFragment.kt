package com.picpay.desafio.android.ui.fragments

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.picpay.desafio.android.ui.MainActivity
import com.picpay.desafio.android.R
import java.lang.IllegalStateException

abstract class BaseFragment : Fragment() {

    private val themeViewModel by lazy { (requireActivity() as MainActivity).themeViewModel }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_social_media -> {
            findNavController().navigate(R.id.action_contactsFragment_to_settingsFragment)
            true
        }
        R.id.action_change_theme -> {
            try {
                themeViewModel.toggleTheme()
                true
            } catch (e: IllegalStateException) {
                Toast.makeText(requireContext(), R.string.cant_perform_action, Toast.LENGTH_SHORT).show()
                false
            }
        }
        else -> false
    }
}