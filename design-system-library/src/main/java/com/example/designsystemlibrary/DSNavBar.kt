package com.example.designsystemlibrary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theme.safepath.DSTheme

@Composable
fun DSNavBar(
    logoResId: Int,
    contentDescription: String? = null
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = logoResId),
            contentDescription = contentDescription
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DSNavBarPreview() {
    DSTheme {
        DSNavBar(logoResId = R.drawable.ic_logo_toolbar)
    }
}