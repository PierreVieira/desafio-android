package com.picpay.desafio.android.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.picpay.desafio.android.contacts.list.ContactsListAdapter
import com.picpay.desafio.android.databinding.FragmentContactsBinding

class ContactsFragment : Fragment() {

    private val viewModel: ContactsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentContactsBinding.inflate(inflater)
        binding.apply {
            lifecycleOwner = this@ContactsFragment
            viewModel = this@ContactsFragment.viewModel
            usersList.adapter = ContactsListAdapter()
        }
        return binding.root
    }
}