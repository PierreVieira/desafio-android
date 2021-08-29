package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class FacebookItem : SocialMedia(
    imageResourceId = R.drawable.ic_facebook,
    titleId = R.string.facebook,
    subTitleId = R.string.my_facebook_user,
    socialMediaLink = R.string.my_facebook_link
)