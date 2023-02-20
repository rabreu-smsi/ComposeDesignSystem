package com.example.productcore.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.designsystemlibrary.theme.AppTheme
import com.example.productcore.ui.screen.TutorialScreen

class TutorialActivity : ComponentActivity() {

    @Composable
    fun RootComposable(onGetStartedClick: () -> Unit) {
        TutorialScreen(onGetStartedClick = onGetStartedClick)
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