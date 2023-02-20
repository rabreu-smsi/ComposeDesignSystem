package com.example.clientapp

import androidx.compose.runtime.Composable
import com.example.clientapp.ui.screen.OverrideTutorialScreen
import com.example.clientapp.ui.theme.ClientTheme
import com.example.productcore.MainActivity

class OverrideMainActivity : MainActivity() {

    @Composable
    override fun RootComposable(onGetStartedButtonClick: () -> Unit) {
        ClientTheme {
            OverrideTutorialScreen(
                onGetStartedButtonClick = onGetStartedButtonClick,
                onSecondButtonClick = {}
            )
        }
    }
}