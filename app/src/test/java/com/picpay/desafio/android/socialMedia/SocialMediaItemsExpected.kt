package com.picpay.desafio.android.socialMedia

import com.picpay.desafio.android.R

object SocialMediaItemsExpected {
    val email = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_gmail,
        titleId = R.string.email,
        subTitleId = R.string.my_email_user,
        socialMediaLink = R.string.my_email_link,
        socialMediaType = SocialMediaType.EMAIL
    )
    val facebook = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_facebook,
        titleId = R.string.facebook,
        subTitleId = R.string.my_facebook_user,
        socialMediaLink = R.string.my_facebook_link,
        socialMediaType = SocialMediaType.FACEBOOK
    )
    val gitHub = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_github,
        titleId = R.string.github,
        subTitleId = R.string.my_github_user,
        socialMediaLink = R.string.my_github_link,
        socialMediaType = SocialMediaType.GITHUB
    )
    val instagram = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_instagram,
        titleId = R.string.instagram,
        subTitleId = R.string.my_instagram_user,
        socialMediaLink = R.string.my_instagram_link,
        socialMediaType = SocialMediaType.INSTAGRAM
    )
    val linkedIn = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_linkedin,
        titleId = R.string.linkedin,
        subTitleId = R.string.my_linkedin_user,
        socialMediaLink = R.string.my_linkedin_link,
        socialMediaType = SocialMediaType.LINKEDIN
    )
    val telegram = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_telegram,
        titleId = R.string.telegram,
        subTitleId = R.string.my_telegram_user,
        socialMediaLink = R.string.my_telegram_link,
        socialMediaType = SocialMediaType.TELEGRAM
    )
    val whatsApp = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_whatsapp,
        titleId = R.string.whatsapp,
        subTitleId = R.string.my_whatsapp_user,
        socialMediaLink = R.string.my_whatsapp_link,
        socialMediaType = SocialMediaType.WHATSAPP
    )
    val youTube = ExpectedSocialMediaItem(
        imageResourceId = R.drawable.ic_youtube,
        titleId = R.string.youtube,
        subTitleId = R.string.my_youtube_user,
        socialMediaLink = R.string.my_youtube_link,
        socialMediaType = SocialMediaType.EMAIL
    )
    val list = listOf(
        gitHub,
        linkedIn,
        email,
        youTube,
        whatsApp,
        telegram,
        instagram,
        facebook,
    )
}