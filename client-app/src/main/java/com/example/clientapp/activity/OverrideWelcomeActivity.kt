package com.example.clientapp.activity

import androidx.compose.runtime.Composable
import com.example.clientapp.ui.screen.OverrideWelcomeScreen
import com.example.productcore.activity.WelcomeActivity

class OverrideWelcomeActivity : WelcomeActivity() {

    @Composable
    override fun RootComposable(onGetStartedClick: () -> Unit) {
        OverrideWelcomeScreen(
            onGetStartedClick = onGetStartedClick,
            onCancelClick = {}
        )
    }
}