package com.picpay.desafio.android.model

import com.squareup.moshi.Json

data class User(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "img") val imageUrl: String,
    @Json(name = "username") val userName: String
)