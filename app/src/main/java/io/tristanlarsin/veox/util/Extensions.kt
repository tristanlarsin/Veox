package io.tristanlarsin.veox.util

import androidx.navigation.NavController

fun NavController.navigate(route: String, popBackStack: Boolean = false) {
    if (popBackStack) popBackStack()
    navigate(route)
}