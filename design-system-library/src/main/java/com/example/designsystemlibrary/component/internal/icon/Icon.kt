package com.example.designsystemlibrary.component.internal.icon

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.designsystemlibrary.R
import com.example.designsystemlibrary.theme.AppTheme

@Composable
private fun BaseIcon(
    modifier: Modifier,
    imageResId: Int,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null
) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .clickable { onClick?.invoke() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .size(24.dp),
            painter = painterResource(id = imageResId),
            contentDescription = contentDescription
        )
    }
}

@Composable
internal fun Icon(
    imageResId: Int,
    size: Dp = 24.dp,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null
) {
    BaseIcon(
        modifier = Modifier.size(size),
        imageResId = imageResId,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

@Composable
internal fun IconFillHeight(
    imageResId: Int,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null
) {
    BaseIcon(
        modifier = Modifier.fillMaxHeight(),
        imageResId = imageResId,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

@Composable
internal fun IconFillWidth(
    imageResId: Int,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null
) {
    BaseIcon(
        modifier = Modifier.fillMaxWidth(),
        imageResId = imageResId,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

@Preview
@Composable
private fun IconPreview() {
    AppTheme {
        Icon(
            imageResId = R.drawable.ic_pin,
            size = 48.dp
        )
    }
}