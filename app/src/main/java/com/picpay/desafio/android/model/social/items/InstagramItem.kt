package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class InstagramItem : SocialMedia(
    imageResourceId = R.drawable.ic_instagram,
    titleId = R.string.instagram,
    subTitleId = R.string.my_instagram_user,
    socialMediaLink = R.string.my_instagram_link
)