package io.tristanlarsin.veox.presentation.splash

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.NavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.tristanlarsin.veox.MainActivity
import io.tristanlarsin.veox.presentation.ui.theme.VeoxTheme
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class SplashScreenTest {
    
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @RelaxedMockK
    lateinit var navController: NavController

    @Before
    fun setup() {
        MockKAnnotations.init(this)
    }

    @Test
    fun splashScreen_displayAndDisappears() = runBlockingTest {
        composeTestRule.setContent { 
            VeoxTheme {
                SplashScreen(navController = navController)
            }
        }

        composeTestRule
            .onNodeWithText("Veox")
            .assertExists()
    }
}