package com.example.productcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.designsystemlibrary.theme.DefaultTheme
import com.example.productcore.ui.screen.WelcomeScreen

open class MainActivity : ComponentActivity() {

    @Composable
    open fun RootComposable(onGetStartedButtonClick: () -> Unit) {
        DefaultTheme {
            //TutorialScreen(onGetStartedButtonClick = onGetStartedButtonClick)
            //RewardsScreen(onButtonClick = {})
            WelcomeScreen(onGetStartedClick = {})
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { RootComposable(onGetStartedButtonClick = {}) }
    }
}