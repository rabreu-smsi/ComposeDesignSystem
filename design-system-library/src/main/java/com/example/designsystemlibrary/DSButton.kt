package com.example.designsystemlibrary

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theme.api.DSTheme
import com.example.theme.safepath.DSTheme

@Composable
fun DSButton(
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(
                horizontal = 37.dp,
                vertical = 16.dp
            )
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = DSTheme.colorScheme.accent,
                contentColor = DSTheme.colorScheme.onAccent,
            )
        ) {
            Text(
                text = text,
                style = DSTheme.typography.Body1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DSButtonPreview() {
    DSTheme {
        DSButton(
            text = "Button",
            onClick = {}
        )
    }
}