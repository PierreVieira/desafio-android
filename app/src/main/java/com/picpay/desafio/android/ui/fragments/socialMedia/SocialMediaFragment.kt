package com.picpay.desafio.android.ui.fragments.socialMedia

import android.os.Bundle
import android.view.*
import com.picpay.desafio.android.R
import com.picpay.desafio.android.databinding.FragmentSocialMediaBinding
import com.picpay.desafio.android.model.social.SocialMedia
import com.picpay.desafio.android.ui.fragments.BaseFragment
import com.picpay.desafio.android.ui.fragments.socialMedia.list.SocialMediaAdapter

class SocialMediaFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSocialMediaBinding.inflate(inflater)
        binding.apply {
            lifecycleOwner = this@SocialMediaFragment
            recyclerView.apply {
                setHasFixedSize(true)
                adapter = SocialMediaAdapter(SocialMedia.data)
            }
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.default_menu, menu)
    }

}