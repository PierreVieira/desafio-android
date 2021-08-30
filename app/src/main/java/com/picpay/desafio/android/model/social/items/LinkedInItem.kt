package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class LinkedInItem : SocialMedia(
    imageResourceId = R.drawable.ic_linkedin,
    titleId = R.string.linkedin,
    subTitleId = R.string.my_linkedin_user,
    socialMediaLink = R.string.my_linkedin_link
)