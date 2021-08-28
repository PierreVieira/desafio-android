package com.picpay.desafio.android

import com.picpay.desafio.android.network.User
import com.picpay.desafio.android.network.PicPayApiService

class ExampleService(
    private val apiService: PicPayApiService
) {

    fun example(): List<User> {
        val users = apiService.getUsers().execute()

        return users.body() ?: emptyList()
    }
}