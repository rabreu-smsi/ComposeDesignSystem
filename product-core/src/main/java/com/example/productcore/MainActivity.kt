package com.example.productcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.productcore.ui.screen.TutorialScreen
import com.example.theme.api.DSAppTheme

open class MainActivity : ComponentActivity() {

    @Composable
    open fun UI(
        onGetStartedButtonClick: () -> Unit
    ) = TutorialScreen(
        onGetStartedButtonClick = onGetStartedButtonClick
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UI(
                onGetStartedButtonClick = {}
            )
        }
    }
}