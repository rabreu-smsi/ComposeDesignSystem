package com.example.designsystemlibrary.component.exposed

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystemlibrary.R
import com.example.designsystemlibrary.theme.DefaultTheme

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
    DefaultTheme {
        DSImage(
            imageResId = R.drawable.img_slide01
        )
    }
}