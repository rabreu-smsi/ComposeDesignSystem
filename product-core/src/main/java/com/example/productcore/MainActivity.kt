package com.example.productcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.productcore.ui.screen.RewardsScreen
import com.example.productcore.ui.screen.TutorialScreen
import com.example.productcore.ui.screen.WelcomeScreen
import com.example.productcore.ui.theme.SafePathTheme

open class MainActivity : ComponentActivity() {

    @Composable
    open fun RootComposable(onGetStartedButtonClick: () -> Unit) {
        SafePathTheme {
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