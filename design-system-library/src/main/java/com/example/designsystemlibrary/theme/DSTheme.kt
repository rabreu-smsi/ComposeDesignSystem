package com.example.designsystemlibrary.theme

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView

var LocalColorScheme: ProvidableCompositionLocal<DSColorScheme>? = null
var LocalTypography: ProvidableCompositionLocal<DSTypography>? = null

private val colorScheme = DSColorScheme()
private val typography = DSTypography()

object DSTheme {
    val colorScheme: DSColorScheme
        @Composable
        get() = LocalColorScheme?.current
            ?: throw IllegalArgumentException("color scheme not initialized")
    val typography: DSTypography
        @Composable
        get() = LocalTypography?.current
            ?: throw IllegalArgumentException("typography not initialized")
}

@Composable
fun DefaultTheme(content: @Composable () -> Unit) {
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
