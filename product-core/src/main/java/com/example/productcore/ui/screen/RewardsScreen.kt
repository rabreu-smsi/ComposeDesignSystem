package com.example.productcore.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.component.DSButton
import com.example.designsystemlibrary.component.DSHeader
import com.example.designsystemlibrary.component.DSNavBar
import com.example.designsystemlibrary.component.DSScreen
import com.example.productcore.R
import com.example.productcore.ui.theme.SafePathTheme

@Composable
fun RewardsScreen() {
    DSScreen {
        Column {
            DSNavBar(
                title = "What's New",
                actions = listOf(
                    NavBarAction(
                        imageResId = R.drawable.ic_question,
                        onClick = {}
                    )
                )
            )
            Spacer(modifier = Modifier.height(27.dp))
            Image(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.img_slide_rewards),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(12.dp))
            DSHeader(
                title = "Rewards are Here!",
                body = "Celebrate good behavior by allowing " +
                    "your child more screen time or a later bedtime."
            )
            Spacer(modifier = Modifier.weight(1f))
            DSButton(
                text = "Click here"
            ) {}
        }
    }
}

@Preview
@Composable
fun RewardsScreenPreview() {
    SafePathTheme {
        RewardsScreen()
    }
}