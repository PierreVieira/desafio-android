package com.picpay.desafio.android.network

import com.picpay.desafio.android.model.User
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


interface ApiService {

    companion object {
        private const val BASE_URL = "https://609a908e0f5a13001721b74e.mockapi.io/picpay/api/"
        private val moshi: Moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL)
            .build()
    }

    @GET("users")
    suspend fun getUsers(): List<User>
}