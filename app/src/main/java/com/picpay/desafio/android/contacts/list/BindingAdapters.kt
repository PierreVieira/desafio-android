package com.picpay.desafio.android.contacts.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.google.android.material.button.MaterialButton
import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.User
import com.picpay.desafio.android.network.ApiStatus

@BindingAdapter("imageUrl")
fun bindImage(imageView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imageUri = it.toUri().buildUpon().scheme("https").build()
        imageView.load(imageUri) {
            placeholder(R.drawable.ic_round_account_circle)
            error(R.drawable.ic_broken_image)
        }
    }
}

@BindingAdapter("textData")
fun bindText(textView: TextView, text: String?) {
    text?.let {
        textView.text = it
    }
}

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<User>?) {
    val adapter = recyclerView.adapter as ContactsListAdapter
    adapter.submitList(data)
}

@BindingAdapter("apiStatus")
fun bindRecyclerStatus(statusImageView: ImageView, status: ApiStatus) {
    when (status) {
        ApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        ApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        ApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}

@BindingAdapter("buttonStatus")
fun buttonStatus(button: MaterialButton, status: ApiStatus) {
    button.visibility = if (status == ApiStatus.ERROR) View.VISIBLE else View.GONE
}