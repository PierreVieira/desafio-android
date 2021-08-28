package com.picpay.desafio.android.contacts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picpay.desafio.android.network.Api
import com.picpay.desafio.android.network.ApiStatus
import com.picpay.desafio.android.model.User
import kotlinx.coroutines.launch
import java.lang.Exception

class ContactsViewModel : ViewModel() {
    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus> = _status
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users

    init {
        getUsers()
    }

    private fun getUsers() {
        viewModelScope.launch {
            _status.value = ApiStatus.LOADING
            try {
                _users.value = Api.retrofitService.getUsers()
                _status.value = ApiStatus.DONE
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                _users.value = emptyList()
            }
        }
    }
}