package io.tristanlarsin.veox.presentation.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    private val _emailText = mutableStateOf("")
    val emailText: State<String> = _emailText

    private val _passwordText = mutableStateOf("")
    val passwordText: State<String> = _passwordText

    fun setEmailText(email: String) {
        _emailText.value = email
    }

    fun setPasswordText(password: String) {
        _passwordText.value = password
    }
}