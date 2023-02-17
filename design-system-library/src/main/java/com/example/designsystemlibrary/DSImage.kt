package com.example.designsystemlibrary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.theme.api.DSAppTheme

@Composable
fun DSImage(
    imageResId: Int,
    contentDescription: String? = null,
) {
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(id = imageResId),
        contentScale = ContentScale.FillWidth,
        contentDescription = contentDescription
    )
}

@Preview
@Composable
private fun DSImagePreview() {
    DSAppTheme {
        DSImage(
            imageResId = R.drawable.img_slide01
        )
    }
}