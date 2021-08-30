package com.picpay.desafio.android

import com.picpay.desafio.android.model.User
import com.picpay.desafio.android.network.WebService

class ExampleService(
    private val webService: WebService
) {

    fun example(): List<User> {
        val users = webService.getUsers().execute()

        return users.body() ?: emptyList()
    }
}