package com.picpay.desafio.android.socialMedia

import com.picpay.desafio.android.model.social.SocialMedia
import com.picpay.desafio.android.model.social.items.*
import org.junit.Test

class SocialMediaTest {

    private val resultedList = SocialMedia.data

    @Test
    fun checkFacebookItem() = checkItemData(SocialMediaItemsExpected.facebook, FacebookItem())

    @Test
    fun checkInstagramItem() = checkItemData(SocialMediaItemsExpected.instagram, InstagramItem())

    @Test
    fun checkGithubItem() = checkItemData(SocialMediaItemsExpected.gitHub, GitHubItem())

    @Test
    fun checkYoutubeItem() = checkItemData(SocialMediaItemsExpected.youTube, YouTubeItem())

    @Test
    fun checkLinkedinItem() = checkItemData(SocialMediaItemsExpected.linkedIn, LinkedInItem())

    @Test
    fun checkTelegramItem() = checkItemData(SocialMediaItemsExpected.telegram, TelegramItem())

    @Test
    fun checkWhatsAppItem() = checkItemData(SocialMediaItemsExpected.whatsApp, WhatsAppItem())

    @Test
    fun checkEmailAppItem() = checkItemData(SocialMediaItemsExpected.email, EmailItem())

    private fun checkItemData(expected: ExpectedSocialMediaItem, resulted: SocialMedia) {
        val differentAttribute = when {
            expected.imageResourceId != resulted.imageResourceId -> Triple(
                "images",
                expected.imageResourceId,
                resulted.imageResourceId
            )
            expected.socialMediaLink != resulted.socialMediaLink -> Triple(
                "links",
                expected.socialMediaLink,
                resulted.socialMediaLink
            )
            expected.titleId != resulted.titleId -> Triple(
                "title",
                expected.titleId,
                resulted.titleId
            )
            expected.subTitleId != resulted.subTitleId -> Triple(
                "subtitleId",
                expected.subTitleId,
                resulted.subTitleId
            )
            else -> null
        }
        differentAttribute?.let {
            val errorMessage =
                "${expected.socialMediaType.name}: Different ${concatenateDifferentAttributes(it)}"
            throw AssertionError(errorMessage)
        }
    }

    private fun concatenateDifferentAttributes(attributes: Triple<String, Int, Int>) =
        "${attributes.first}\nExpected: ${attributes.second}\nResulted: ${attributes.third}"

    @Test
    fun checkList() {
        checkListSize()
        checkListOrder()
    }

    private fun checkListSize() {
        if (SocialMediaItemsExpected.list.size > resultedList.size) {
            throw AssertionError("Expected list is longer than resulting list")
        } else if (SocialMediaItemsExpected.list.size < resultedList.size) {
            throw AssertionError("Expected list is smaller than the resulting list")
        }
    }

    private fun checkListOrder() {
        SocialMediaItemsExpected.list.forEachIndexed { index, expected ->
            try {
                checkItemData(expected, resultedList[index])
            } catch (differentItemsError: AssertionError) {
                throw AssertionError("Index: $index. ${differentItemsError.message}")
            }
        }
    }
}