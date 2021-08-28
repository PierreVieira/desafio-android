package com.picpay.desafio.android

import retrofit2.Call
import retrofit2.http.GET


interface PicPayApiService {

    @GET("users")
    fun getUsers(): Call<List<User>>
}