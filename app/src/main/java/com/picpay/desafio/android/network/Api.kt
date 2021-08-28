package com.picpay.desafio.android.network

object Api {
    val retrofitService: ApiService by lazy {
        ApiService.retrofit.create(ApiService::class.java)
    }
}