package com.picpay.desafio.android.model.social.items

import com.picpay.desafio.android.R
import com.picpay.desafio.android.model.social.SocialMedia

class GithubItem : SocialMedia(
    imageResourceId = R.drawable.ic_github,
    titleId = R.string.github,
    subTitleId = R.string.my_github_user,
    socialMediaLink = R.string.my_github_link
)