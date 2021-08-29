package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class EmailItem : SocialMedia(
    imageResourceId = R.drawable.ic_gmail,
    titleId = R.string.email,
    subTitleId = R.string.my_email_user,
    socialMediaLink = R.string.my_email_link
)