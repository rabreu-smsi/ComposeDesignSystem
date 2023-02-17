package com.example.theme.safepath

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import com.example.theme.api.LocalColorScheme
import com.example.theme.api.LocalTypography

@Composable
fun DSTheme(
    content: @Composable () -> Unit,
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val activity = view.context as Activity
            activity.window.statusBarColor = dsColorScheme.onBackgroundLight.toArgb()
        }
    }

    LocalColorScheme = staticCompositionLocalOf { dsColorScheme }
    LocalTypography = staticCompositionLocalOf { dsTypography }

    CompositionLocalProvider(
        LocalColorScheme!! provides dsColorScheme,
        LocalTypography!! provides dsTypography,
        content = content
    )
}