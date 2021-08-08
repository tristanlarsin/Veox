package io.tristanlarsin.veox.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import io.tristanlarsin.veox.R
import io.tristanlarsin.veox.presentation.ui.theme.SpaceMedium

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel = hiltViewModel()
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(SpaceMedium),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = stringResource(id = R.string.screen_main_title),
                style = MaterialTheme.typography.h1,
            )
        }
    }
}