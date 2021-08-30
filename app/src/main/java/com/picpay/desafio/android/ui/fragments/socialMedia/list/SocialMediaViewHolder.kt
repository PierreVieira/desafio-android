package com.picpay.desafio.android.ui.fragments.socialMedia.list

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.picpay.desafio.android.databinding.SocialMediaItemBinding
import com.picpay.desafio.android.model.social.SocialMedia
import kotlinx.coroutines.*

class SocialMediaViewHolder(private val binding: SocialMediaItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(socialMedia: SocialMedia) {
        binding.apply {
            this.socialMedia = socialMedia
            onClickSocialMedia = { openSocialMedia(socialMedia.socialMediaLink) }
            shimmerAnimationControl()
        }
    }

    private fun SocialMediaItemBinding.shimmerAnimationControl() {
        shimmer.startShimmerAnimation()
        CoroutineScope(Dispatchers.IO).launch {
            delay(500L)
            withContext(Dispatchers.Main) {
                shimmer.stopShimmerAnimation()
                shimmer.visibility = View.GONE
            }
        }
    }

    private fun openSocialMedia(socialMediaLinkResourceId: Int) {
        val context = binding.root.context
        val url = context.getString(socialMediaLinkResourceId)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(intent)
    }
}