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

    private val _isButtonEnabled = mutableStateOf(false)
    val isButtonEnabled: State<Boolean> = _isButtonEnabled

    fun setEmailText(email: String) {
        _emailText.value = email
        updateButtonState()
    }

    fun setPasswordText(password: String) {
        _passwordText.value = password
        updateButtonState()
    }

    private fun updateButtonState() {
        _isButtonEnabled.value = emailText.value.isNotBlank() && passwordText.value.isNotBlank()
    }

    fun login() {
        // TODO (Tristan) -
    }
}