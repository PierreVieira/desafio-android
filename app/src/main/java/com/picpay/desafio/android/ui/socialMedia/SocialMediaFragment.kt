package com.picpay.desafio.android.ui.socialMedia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.picpay.desafio.android.databinding.FragmentSocialMediaBinding
import com.picpay.desafio.android.model.social.SocialMedia
import com.picpay.desafio.android.ui.socialMedia.list.SocialMediaAdapter

class SocialMediaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSocialMediaBinding.inflate(inflater)
        binding.apply {
            lifecycleOwner = this@SocialMediaFragment
            recyclerView.apply{
                setHasFixedSize(true)
                adapter = SocialMediaAdapter(SocialMedia.data)
            }
        }
        return binding.root
    }

}