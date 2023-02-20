package com.example.clientapp

import androidx.compose.runtime.Composable
import com.example.clientapp.ui.screen.OverrideTutorialScreen
import com.example.clientapp.ui.theme.ClientTheme
import com.example.productcore.MainActivity
import com.example.productcore.ui.screen.RewardsScreen
import com.example.productcore.ui.screen.TutorialScreen
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