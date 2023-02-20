package com.example.designsystemlibrary.component.exposed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.R
import com.example.designsystemlibrary.component.internal.icon.Icon
import com.example.designsystemlibrary.theme.DSTheme
import com.example.designsystemlibrary.theme.DesignSystemTheme

@Composable
fun DSParagraph(
    imageResId: Int,
    text: String
) {
    Row(
        modifier = Modifier.heightIn(min = 76.dp)
    ) {
        Box(
            modifier = Modifier
                .width(56.dp)
                .heightIn(min = 76.dp)
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp, bottom = 36.dp)
        ) {
            Icon(imageResId = imageResId)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 76.dp)
                .padding(top = 16.dp, bottom = 36.dp)
        ) {
            Text(
                text = text,
                style = DSTheme.typography.body1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListItemPreview() {
    DesignSystemTheme {
        DSParagraph(
            imageResId = R.drawable.ic_pin,
            text = "Keep track of your family members' current location."
        )
    }
}