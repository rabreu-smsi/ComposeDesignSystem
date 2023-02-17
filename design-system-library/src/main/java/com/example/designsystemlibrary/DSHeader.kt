package com.example.designsystemlibrary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theme.api.DSAppTheme
import com.example.theme.api.DSTheme

@Composable
fun DSHeader(
    title: String,
    body: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 38.dp,
                vertical = 16.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = DSTheme.typography.H3
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = body,
            style = DSTheme.typography.Body1,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DSHeaderPreview() {
    DSAppTheme {
        DSHeader(
            title = "Header title",
            body = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                "molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum\n" +
                "numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium\n" +
                "optio, eaque rerum!"
        )
    }
}