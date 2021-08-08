package io.tristanlarsin.veox.presentation.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.tristanlarsin.veox.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StandardTextFieldTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    // TODO (Tristan) - Fix
    @Test
    fun enterTooLongString_maxLengthNotExceeded() {
        initComposable()

        composeTestRule
            .onNodeWithTag(TEST_TAG)
            .performTextInput("123456")

        composeTestRule
            .onNodeWithTag(TEST_TAG)
            .assert(hasText("12345"))
    }

    private fun initComposable() {
        composeTestRule.setContent {
            var text by remember {
                mutableStateOf("")
            }

            MaterialTheme {
                StandardTextField(
                    text = text,
                    onValueChanged =  {
                        text = it
                    },
                    maxLength = 5
                )
            }
        }
    }
}