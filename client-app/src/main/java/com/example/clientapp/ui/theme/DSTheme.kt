package com.example.clientapp.ui.theme

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import com.example.designsystemlibrary.theme.LocalColorScheme
import com.example.designsystemlibrary.theme.LocalTypography

@Composable
fun ClientTheme(content: @Composable () -> Unit) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val activity = view.context as Activity
            activity.window.statusBarColor = clientColorScheme.onBackgroundLight.toArgb()
        }
    }

    LocalColorScheme = staticCompositionLocalOf { clientColorScheme }
    LocalTypography = staticCompositionLocalOf { clientTypography }

    CompositionLocalProvider(
        LocalColorScheme!! provides clientColorScheme,
        LocalTypography!! provides clientTypography,
        content = content
    )
}