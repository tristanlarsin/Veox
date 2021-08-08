package io.tristanlarsin.veox.presentation.login

import android.graphics.Paint
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import io.tristanlarsin.veox.presentation.ui.theme.SpaceMedium
import io.tristanlarsin.veox.R
import io.tristanlarsin.veox.presentation.components.StandardTextField

@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(SpaceMedium)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
        ) {
            Text(text = stringResource(id = R.string.login), style = MaterialTheme.typography.h1)
            Spacer(modifier = Modifier.height(SpaceMedium))
            StandardTextField(
                text = viewModel.emailText.value,
                hint = stringResource(id = R.string.email_hint),
                keyboardType = KeyboardType.Email,
                onValueChanged = {
                    viewModel.setEmailText(it)
                }
            )
            Spacer(modifier = Modifier.height(SpaceMedium))
            StandardTextField(
                text = viewModel.passwordText.value,
                hint = stringResource(id = R.string.password_hint),
                keyboardType = KeyboardType.Password,
                onValueChanged = {
                    viewModel.setPasswordText(it)
                }
            )
        }
        Text(text = buildAnnotatedString {
            append(stringResource(id = R.string.dont_have_an_account_yet))
            append(" ")
            val signUpText = stringResource(id = R.string.sign_up)
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colors.primary
                )
            ) {
                append(signUpText)
            }
        },
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )
    }
}