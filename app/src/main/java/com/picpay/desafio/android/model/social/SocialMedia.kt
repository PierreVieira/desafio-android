package com.picpay.desafio.android.model.social

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.picpay.desafio.android.model.social.items.*

abstract class SocialMedia(
    @DrawableRes val imageResourceId: Int,
    @StringRes val titleId: Int,
    @StringRes val subTitleId: Int,
    @StringRes val socialMediaLink: Int
) {
    companion object {
        val data = listOf(
            GithubItem(),
            LinkedinItem(),
            EmailItem(),
            YoutubeItem(),
            WhatsAppItem(),
            TelegramItem(),
            InstagramItem(),
            FacebookItem(),
        )
    }
}