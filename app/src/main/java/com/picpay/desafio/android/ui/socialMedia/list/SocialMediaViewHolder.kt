package com.picpay.desafio.android.ui.socialMedia.list

import android.content.Intent
import android.net.Uri
import androidx.recyclerview.widget.RecyclerView
import com.picpay.desafio.android.databinding.SocialMediaItemBinding
import com.picpay.desafio.android.model.social.SocialMedia

class SocialMediaViewHolder(private val binding: SocialMediaItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(socialMedia: SocialMedia) {
        binding.apply {
            this.socialMedia = socialMedia
            onClickSocialMedia = { openSocialMedia(socialMedia.socialMediaLink) }
        }
    }

    private fun openSocialMedia(socialMediaLinkResourceId: Int) {
        val context = binding.root.context
        val url = context.getString(socialMediaLinkResourceId)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(intent)
    }
}