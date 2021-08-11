package io.tristanlarsin.veox.presentation.main

import androidx.compose.runtime.mutableStateOf
import dagger.hilt.android.lifecycle.HiltViewModel
import io.tristanlarsin.common.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): BaseViewModel<MainViewModel.Action>() {

    override fun handleAction(action: Action) {
        when (action) {
        }
    }

    sealed class Action {

    }
}