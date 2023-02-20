package com.example.clientapp

import androidx.compose.runtime.Composable
import com.example.clientapp.ui.ClientTheme
import com.example.productcore.MainActivity
import com.example.productcore.ui.screen.WelcomeScreen

class OverrideMainActivity : MainActivity() {

    @Composable
    override fun RootComposable(onGetStartedButtonClick: () -> Unit) {
        ClientTheme {
            // TutorialScreen(onGetStartedButtonClick = onGetStartedButtonClick)
            // RewardsScreen(onButtonClick = {})
            WelcomeScreen(onGetStartedClick = {})

            // OverrideTutorialScreen(
            //     onGetStartedButtonClick = onGetStartedButtonClick,
            //     onSecondButtonClick = {}
            // )
        }
    }
}