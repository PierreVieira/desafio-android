package com.picpay.desafio.android.ui.contacts.list

import android.content.Intent
import android.net.Uri
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.picpay.desafio.android.databinding.UserItemBinding
import com.picpay.desafio.android.model.User

class UserViewHolder(private val bindig: UserItemBinding) :
    RecyclerView.ViewHolder(bindig.root) {

    companion object {
        const val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

    fun bind(user: User) {
        bindig.apply {
            this.user = user
            onClickUserItem = { searchOnGoogle(user.name) }
            executePendingBindings()
        }
    }

    private fun searchOnGoogle(name: String) {
        val queryUrl = Uri.parse("${SEARCH_PREFIX}${name}")
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        val context = bindig.root.context
        context.startActivity(intent)
    }
}