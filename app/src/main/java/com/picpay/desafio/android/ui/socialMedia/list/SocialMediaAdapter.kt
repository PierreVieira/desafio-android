package com.picpay.desafio.android.ui.socialMedia.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.picpay.desafio.android.databinding.SocialMediaItemBinding
import com.picpay.desafio.android.model.social.SocialMedia

class SocialMediaAdapter(private val dataset: List<SocialMedia>) :
    RecyclerView.Adapter<SocialMediaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SocialMediaViewHolder(
            SocialMediaItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: SocialMediaViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun getItemCount() = dataset.size

}