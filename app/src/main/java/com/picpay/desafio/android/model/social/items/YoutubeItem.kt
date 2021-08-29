package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class YoutubeItem : SocialMedia(
    imageResourceId = R.drawable.ic_youtube,
    titleId = R.string.youtube,
    subTitleId = R.string.my_youtube_user,
    socialMediaLink = R.string.my_youtube_link
)