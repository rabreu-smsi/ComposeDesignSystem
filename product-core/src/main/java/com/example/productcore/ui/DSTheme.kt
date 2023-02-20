package com.example.productcore.ui

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import com.example.designsystemlibrary.theme.DSColorScheme
import com.example.designsystemlibrary.theme.DSTypography
import com.example.designsystemlibrary.theme.LocalColorScheme
import com.example.designsystemlibrary.theme.LocalTypography

private val colorScheme = DSColorScheme()
private val typography = DSTypography()

@Composable
internal fun SafePathTheme(content: @Composable () -> Unit) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val activity = view.context as Activity
            activity.window.statusBarColor = colorScheme.onBackgroundLight.toArgb()
        }
    }

    LocalColorScheme = staticCompositionLocalOf { colorScheme }
    LocalTypography = staticCompositionLocalOf { typography }

    CompositionLocalProvider(
        LocalColorScheme!! provides colorScheme,
        LocalTypography!! provides typography,
        content = content
    )
}