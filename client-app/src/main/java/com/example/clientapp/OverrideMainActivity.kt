package com.example.clientapp

import androidx.compose.runtime.Composable
import com.example.clientapp.ui.screen.OverrideTutorialScreen
import com.example.productcore.MainActivity
import com.example.theme.api.AppTheme

class OverrideMainActivity : MainActivity() {

    @Composable
    override fun Screen(
        onGetStartedButtonClick: () -> Unit
    ) {
        OverrideTutorialScreen(
            onGetStartedButtonClick = onGetStartedButtonClick,
            onSecondButtonClick = {}
        )
    }
}