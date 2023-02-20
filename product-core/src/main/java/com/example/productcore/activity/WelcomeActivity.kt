package com.example.productcore.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.designsystemlibrary.theme.AppTheme
import com.example.productcore.ui.screen.WelcomeScreen

open class WelcomeActivity : ComponentActivity() {

    @Composable
    open fun RootComposable(onGetStartedClick: () -> Unit) {
        WelcomeScreen(onGetStartedClick = onGetStartedClick)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                RootComposable(onGetStartedClick = {})
            }
        }
    }
}

