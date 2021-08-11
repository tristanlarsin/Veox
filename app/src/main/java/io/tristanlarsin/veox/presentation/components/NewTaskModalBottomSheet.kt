package io.tristanlarsin.veox.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import io.tristanlarsin.veox.R
import io.tristanlarsin.veox.presentation.ui.theme.SpaceMedium

@ExperimentalMaterialApi
@Composable
fun NewTaskModalBottomSheet(
    modalBottomSheetState: ModalBottomSheetState,
    onCreateTask: () -> Unit
) {

    // TODO (Tristan) - AUto focus text field when modal is shown

    val focusRequester = FocusRequester()
    val context = LocalContext.current

    ModalBottomSheetLayout(
        sheetState = modalBottomSheetState,
        sheetContent = {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                ) {
                    Text(
                        modifier = Modifier.padding(SpaceMedium),
                        text = stringResource(id = R.string.new_todo),
                        style = MaterialTheme.typography.h1
                    )
                    StandardTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(SpaceMedium)
                            .focusRequester(focusRequester),
                        hint = stringResource(id = R.string.enter_todo),
                        onValueChanged = {

                        }
                    )
                }
            }
        }
    ) {

    }
}