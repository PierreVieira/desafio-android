package com.picpay.desafio.android.ui.fragments.contacts

import android.os.Bundle
import android.view.*
import androidx.fragment.app.viewModels
import com.picpay.desafio.android.R
import com.picpay.desafio.android.databinding.FragmentContactsBinding
import com.picpay.desafio.android.ui.fragments.BaseFragment
import com.picpay.desafio.android.ui.fragments.contacts.list.ContactsListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactsFragment : BaseFragment() {

    private val contactsViewModel: ContactsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentContactsBinding.inflate(inflater)
        binding.apply {
            lifecycleOwner = this@ContactsFragment
            viewModel = this@ContactsFragment.contactsViewModel
            recyclerView.adapter = ContactsListAdapter()
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.contact_menu, menu)
    }
}