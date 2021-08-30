package com.picpay.desafio.android.socialMedia

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.picpay.desafio.android.model.social.SocialMedia

class ExpectedSocialMediaItem(
    @DrawableRes imageResourceId: Int,
    @StringRes titleId: Int,
    @StringRes subTitleId: Int,
    @StringRes socialMediaLink: Int,
    val socialMediaType: SocialMediaType
) : SocialMedia(imageResourceId, titleId, subTitleId, socialMediaLink)