package com.picpay.desafio.android

import com.picpay.desafio.android.model.User
import com.picpay.desafio.android.network.ApiService

class ExampleService(
    private val apiService: ApiService
) {

    fun example(): List<User> {
        val users = apiService.getUsers().execute()

        return users.body() ?: emptyList()
    }
}