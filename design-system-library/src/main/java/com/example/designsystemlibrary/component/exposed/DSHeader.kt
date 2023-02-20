package com.example.designsystemlibrary.component.exposed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.theme.AppTheme
import com.example.designsystemlibrary.theme.DSTheme

@Composable
fun DSHeader(
    title: String,
    body: String? = null,
    textAlign: TextAlign = TextAlign.Start
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp, bottom = 8.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = title,
            color = DSTheme.colorScheme.onBackground,
            style = DSTheme.typography.h2,
            textAlign = textAlign
        )

        if (body != null) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = body,
                color = DSTheme.colorScheme.onBackground,
                style = DSTheme.typography.body2,
                textAlign = textAlign
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DSHeaderPreview() {
    AppTheme {
        DSHeader(title = "Header title")
    }
}

@Preview(showBackground = true)
@Composable
private fun DSHeaderPreview_withBody() {
    AppTheme {
        DSHeader(
            title = "Header title",
            body = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                "molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum\n" +
                "numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium\n" +
                "optio, eaque rerum!"
        )
    }
}