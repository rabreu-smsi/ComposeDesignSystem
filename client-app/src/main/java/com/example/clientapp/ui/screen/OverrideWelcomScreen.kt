package com.example.clientapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clientapp.ui.ClientTheme
import com.example.designsystemlibrary.component.exposed.DSButton
import com.example.designsystemlibrary.component.exposed.DSHeader
import com.example.designsystemlibrary.component.exposed.DSImage
import com.example.designsystemlibrary.component.exposed.DSParagraph
import com.example.designsystemlibrary.component.exposed.DSScreen
import com.example.productcore.R

@Composable
fun OverrideWelcomeScreen(
    onGetStartedClick: () -> Unit,
    onCancelClick: () -> Unit
) {
    DSScreen {
        Column {
            DSImage(imageResId = R.drawable.ic_welcome_location_drive)
            DSHeader(title = "Welcome to SafePath!")
            DSParagraph(
                imageResId = R.drawable.ic_pin,
                text = "Keep track of your family members' current location."
            )
            DSParagraph(
                imageResId = R.drawable.ic_pin2,
                text = "Set up Safety Areas and get notified when family members enter " +
                    "and/or leave these locations."
            )
            DSParagraph(
                imageResId = R.drawable.ic_car,
                text = "Monitor and manage driving data, including trips, phone usage" +
                    " while driving, and more."
            )
            Spacer(modifier = Modifier.weight(1f))
            DSButton(
                text = "Get started",
                onClick = onGetStartedClick
            )
            DSButton(
                text = "Cancel",
                onClick = onCancelClick
            )
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    ClientTheme {
        OverrideWelcomeScreen(
            onGetStartedClick = {},
            onCancelClick = {}
        )
    }
}