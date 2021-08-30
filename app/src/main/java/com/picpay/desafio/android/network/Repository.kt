package com.picpay.desafio.android.network

import javax.inject.Inject

class Repository @Inject constructor(
    private val webService: WebService
) {
    suspend fun getUsers() = webService.getUsers()
}