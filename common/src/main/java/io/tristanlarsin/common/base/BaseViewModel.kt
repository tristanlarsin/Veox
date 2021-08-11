package io.tristanlarsin.common.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<A: Any> : ViewModel() {
    abstract fun handleAction(action: A)
}