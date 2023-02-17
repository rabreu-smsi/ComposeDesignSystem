package com.example.clientapp

import androidx.compose.runtime.Composable
import com.example.clientapp.ui.screen.OverrideTutorialScreen
import com.example.productcore.MainActivity

class OverrideMainActivity : MainActivity() {

    @Composable
    override fun UI(
        onGetStartedButtonClick: () -> Unit
    ) {
        OverrideTutorialScreen(
            onGetStartedButtonClick = onGetStartedButtonClick,
            onSecondButtonClick = {}
        )
    }
}