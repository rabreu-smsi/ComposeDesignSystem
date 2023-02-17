package com.example.designsystemlibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.theme.api.DSAppTheme
import com.example.theme.api.DSTheme

@Composable
fun DSScreen(
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DSTheme.colorScheme.background)
    ) {
        content()
    }
}

@Preview
@Composable
private fun DSScreenPreview() {
    DSAppTheme {
        DSScreen {}
    }
}