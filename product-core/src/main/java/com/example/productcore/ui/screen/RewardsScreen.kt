package com.example.productcore.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.component.exposed.DSButton
import com.example.designsystemlibrary.component.exposed.DSHeader
import com.example.designsystemlibrary.component.exposed.DSImage
import com.example.designsystemlibrary.component.exposed.DSScreen
import com.example.designsystemlibrary.component.exposed.navbar.DSNavBar
import com.example.designsystemlibrary.component.exposed.navbar.NavBarAction
import com.example.designsystemlibrary.theme.DefaultTheme
import com.example.productcore.R

@Composable
fun RewardsScreen(
    onButtonClick: () -> Unit
) {
    DSScreen {
        Column {
            DSNavBar(
                title = "What's New",
                onBackPressed = {},
                actions = listOf(
                    NavBarAction(
                        imageResId = R.drawable.ic_question,
                        onClick = {}
                    )
                )
            )
            Spacer(modifier = Modifier.height(27.dp))
            DSImage(imageResId = R.drawable.img_slide_rewards)
            Spacer(modifier = Modifier.height(12.dp))
            DSHeader(
                title = "Rewards are Here!",
                body = "Celebrate good behavior by allowing " +
                    "your child more screen time or a later bedtime."
            )
            Spacer(modifier = Modifier.weight(1f))
            DSButton(
                text = "Click here",
                onClick = onButtonClick
            )
        }
    }
}

@Preview
@Composable
private fun RewardsScreenPreview() {
    DefaultTheme {
        RewardsScreen(onButtonClick = {})
    }
}