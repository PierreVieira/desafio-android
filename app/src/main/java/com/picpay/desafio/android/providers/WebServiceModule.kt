package com.picpay.desafio.android.providers

import com.picpay.desafio.android.network.WebService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
object WebServiceModule {
    @Provides
    fun provideWebService(): WebService = WebService.retrofit.create(WebService::class.java)
}