package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class WhatsAppItem : SocialMedia(
    imageResourceId = R.drawable.ic_whatsapp,
    titleId = R.string.whatsapp,
    subTitleId = R.string.my_whatsapp_user,
    socialMediaLink = R.string.my_whatsapp_link
)