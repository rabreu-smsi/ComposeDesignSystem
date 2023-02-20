package com.example.productcore.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.component.DSButton
import com.example.designsystemlibrary.component.DSHeader
import com.example.designsystemlibrary.component.DSImage
import com.example.designsystemlibrary.component.DSNavBar
import com.example.designsystemlibrary.component.DSScreen
import com.example.productcore.R
import com.example.productcore.ui.theme.SafePathTheme

@Composable
fun TutorialScreen(
    onGetStartedButtonClick: () -> Unit
) {
    DSScreen {
        Column {
            DSNavBar(logoResId = R.drawable.ic_logo_toolbar)
            Spacer(modifier = Modifier.height(53.dp))
            DSImage(imageResId = R.drawable.img_slide01)
            Spacer(modifier = Modifier.height(24.dp))
            DSHeader(
                title = "Keep Your Family Safe",
                body = "Location Monitoring, Tracking, and Parental Controls made easy."
            )
            Spacer(modifier = Modifier.weight(1f))
            DSButton(
                text = "Get started",
                onClick = onGetStartedButtonClick
            )
        }
    }
}

@Preview
@Composable
private fun TutorialScreenPreview() {
    SafePathTheme {
        TutorialScreen(
            onGetStartedButtonClick = {}
        )
    }
}