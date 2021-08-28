package com.picpay.desafio.android.contacts.list

import androidx.recyclerview.widget.DiffUtil
import com.picpay.desafio.android.network.User

class ContactsListDiffCallback(
    private val oldList: List<User>,
    private val newList: List<User>
) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition].username == newList[newItemPosition].username

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = true
}