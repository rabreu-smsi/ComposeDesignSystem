package com.example.productcore.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.component.exposed.DSButton
import com.example.designsystemlibrary.component.exposed.DSHeader
import com.example.designsystemlibrary.component.exposed.DSImage
import com.example.designsystemlibrary.component.exposed.DSScreen
import com.example.designsystemlibrary.component.exposed.navbar.DSNavBar
import com.example.designsystemlibrary.theme.AppTheme
import com.example.productcore.R

@Composable
fun TutorialScreen(
    onGetStartedClick: () -> Unit
) {
    DSScreen {
        Column {
            DSNavBar(logoResId = R.drawable.ic_logo_toolbar)
            Spacer(modifier = Modifier.height(53.dp))
            DSImage(imageResId = R.drawable.img_slide01)
            Spacer(modifier = Modifier.height(24.dp))
            DSHeader(
                title = "Keep Your Family Safe",
                body = "Location Monitoring, Tracking, and Parental Controls made easy.",
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.weight(1f))
            DSButton(
                text = "Get started",
                onClick = onGetStartedClick
            )
        }
    }
}

@Preview
@Composable
private fun TutorialScreenPreview() {
    AppTheme {
        TutorialScreen(
            onGetStartedClick = {}
        )
    }
}