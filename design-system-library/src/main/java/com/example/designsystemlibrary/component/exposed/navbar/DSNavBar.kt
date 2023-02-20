package com.example.designsystemlibrary.component.exposed.navbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.R
import com.example.designsystemlibrary.component.internal.icon.Icon
import com.example.designsystemlibrary.component.internal.icon.IconFillHeight
import com.example.designsystemlibrary.theme.DSTheme
import com.example.designsystemlibrary.theme.DesignSystemTheme

@Composable
private fun BaseNavBar(
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        content = content
    )
}

@Composable
fun DSNavBar(
    logoResId: Int,
    contentDescription: String? = null
) {
    BaseNavBar {
        Image(
            painter = painterResource(id = logoResId),
            contentDescription = contentDescription
        )
    }
}

@Composable
fun DSNavBar(
    title: String,
    onBackPressed: () -> Unit,
    actions: List<NavBarAction>
) {
    BaseNavBar {
        IconFillHeight(
            imageResId = R.drawable.ic_chevron_left,
            onClick = onBackPressed
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = title,
            style = DSTheme.typography.H4,
            color = DSTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.weight(1f))
        actions.forEach { navBarAction ->
            IconFillHeight(
                imageResId = navBarAction.imageResId,
                contentDescription = navBarAction.contentDescription,
                onClick = navBarAction.onClick
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DSNavBarPreview() {
    DesignSystemTheme {
        DSNavBar(logoResId = R.drawable.ic_logo_toolbar)
    }
}

@Preview(showBackground = true)
@Composable
private fun DSNavBarPreview_title() {
    DesignSystemTheme {
        DSNavBar(
            title = "Nav Bar Title",
            onBackPressed = {},
            actions = listOf(
                NavBarAction(
                    imageResId = android.R.drawable.ic_menu_add,
                    onClick = {}
                )
            )
        )
    }
}