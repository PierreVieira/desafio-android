package com.picpay.desafio.android

class ExampleService(
    private val apiService: PicPayApiService
) {

    fun example(): List<User> {
        val users = apiService.getUsers().execute()

        return users.body() ?: emptyList()
    }
}