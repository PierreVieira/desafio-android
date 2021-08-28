package com.picpay.desafio.android.contacts.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.picpay.desafio.android.databinding.UserItemBinding
import com.picpay.desafio.android.model.User

class ContactsListAdapter : ListAdapter<User, ContactsListAdapter.UserViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User) =
            oldItem.userName == newItem.userName

        override fun areContentsTheSame(oldItem: User, newItem: User) =
            oldItem.imageUrl == newItem.imageUrl

    }

    inner class UserViewHolder(private val bindig: UserItemBinding) :
        RecyclerView.ViewHolder(bindig.root) {
        fun bind(user: User) {
            bindig.apply {
                this.user = user
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        UserViewHolder(UserItemBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = getItem(position)
        holder.bind(user)
    }

}