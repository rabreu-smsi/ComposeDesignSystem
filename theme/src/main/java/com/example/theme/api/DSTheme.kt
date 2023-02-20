package com.example.theme.api

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import com.example.theme.BuildConfig
import com.example.theme.impl.client.dsColorSchemeClient
import com.example.theme.impl.safepath.dsColorSchemeSafePath
import com.example.theme.impl.safepath.dsTypographySafePath

var LocalColorScheme: ProvidableCompositionLocal<DSColorScheme>? = null
var LocalTypography: ProvidableCompositionLocal<DSTypography>? = null
var Theme: AppTheme = AppTheme.SafePath

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
fun DSAppTheme(
    content: @Composable () -> Unit,
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val activity = view.context as Activity
            activity.window.statusBarColor = getColorScheme().onBackgroundLight.toArgb()
        }
    }

    LocalColorScheme = staticCompositionLocalOf { getColorScheme() }
    LocalTypography = staticCompositionLocalOf { getTypography() }

    CompositionLocalProvider(
        LocalColorScheme!! provides getColorScheme(),
        LocalTypography!! provides getTypography(),
        content = content
    )
}

private fun getColorScheme() = when (Theme) {
    AppTheme.SafePath -> dsColorSchemeSafePath
    AppTheme.Client -> dsColorSchemeClient
}

private fun getTypography() = when (Theme) {
    AppTheme.SafePath -> dsTypographySafePath
    AppTheme.Client -> dsTypographySafePath
}
