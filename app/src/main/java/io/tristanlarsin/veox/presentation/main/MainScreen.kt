package io.tristanlarsin.veox.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import io.tristanlarsin.veox.R
import io.tristanlarsin.veox.presentation.components.NewTaskModalBottomSheet
import io.tristanlarsin.veox.presentation.components.StandardTextField
import io.tristanlarsin.veox.presentation.main.MainViewModel.Action
import io.tristanlarsin.veox.presentation.ui.theme.SpaceMedium
import io.tristanlarsin.veox.presentation.ui.theme.icons
import io.tristanlarsin.veox.util.hideKeyboard
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel = hiltViewModel()
) {

    val scope = rememberCoroutineScope()

    val modalBottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden
    )


    // Modal Bottom Sheet to create new task
    NewTaskModalBottomSheet(
        modalBottomSheetState = modalBottomSheetState
    ) {
        // TODO (Tristan) - New task item
    }


    // Main Content
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
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.h1,
            )
        }

        FloatingActionButton(
            onClick = {
                scope.launch {
                    modalBottomSheetState.show()
                }
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(SpaceMedium)
        ) {
            Icon(
                imageVector = icons.Add,
                contentDescription = stringResource(id = R.string.fab_content_description)
            )
        }
    }


}