package io.tristanlarsin.veox.presentation.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import io.tristanlarsin.veox.presentation.ui.theme.SpaceMedium
import io.tristanlarsin.veox.R
import io.tristanlarsin.veox.presentation.components.StandardTextField
import io.tristanlarsin.veox.presentation.ui.theme.SpaceSmall

@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {
    Column(
        verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = SpaceMedium)
    ) {
        Text(text = stringResource(id = R.string.login), style = MaterialTheme.typography.h1)
        Spacer(modifier = Modifier.height(SpaceSmall))
        StandardTextField(
            text = viewModel.emailText.value,
            hint = stringResource(id = R.string.email_hint),
            keyboardType = KeyboardType.Email,
            onValueChanged = {
                viewModel.setEmailText(it)
            }
        )
        Spacer(modifier = Modifier.height(SpaceSmall))
        StandardTextField(
            text = viewModel.passwordText.value,
            hint = stringResource(id = R.string.password_hint),
            keyboardType = KeyboardType.Password,
            onValueChanged = {
                viewModel.setPasswordText(it)
            }
        )
    }
}