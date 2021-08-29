package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class TelegramItem : SocialMedia(
    imageResourceId = R.drawable.ic_telegram,
    titleId = R.string.telegram,
    subTitleId = R.string.my_telegram_user,
    socialMediaLink = R.string.my_telegram_link
)