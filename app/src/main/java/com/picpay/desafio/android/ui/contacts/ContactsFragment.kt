package com.picpay.desafio.android.ui.contacts

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.picpay.desafio.android.R
import com.picpay.desafio.android.databinding.FragmentContactsBinding
import com.picpay.desafio.android.ui.contacts.list.ContactsListAdapter

class ContactsFragment : Fragment() {

    private val viewModel: ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentContactsBinding.inflate(inflater)
        binding.apply {
            lifecycleOwner = this@ContactsFragment
            viewModel = this@ContactsFragment.viewModel
            recyclerView.adapter = ContactsListAdapter()
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_social_media -> {
            findNavController().navigate(R.id.action_contactsFragment_to_settingsFragment)
            true
        }
        else -> false
    }
}