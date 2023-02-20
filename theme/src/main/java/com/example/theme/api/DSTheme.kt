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
    appTheme: AppTheme,
    content: @Composable () -> Unit,
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val activity = view.context as Activity
            activity.window.statusBarColor = getColorScheme(appTheme).onBackgroundLight.toArgb()
        }
    }

    LocalColorScheme = staticCompositionLocalOf { getColorScheme(appTheme) }
    LocalTypography = staticCompositionLocalOf { getTypography(appTheme) }

    CompositionLocalProvider(
        LocalColorScheme!! provides getColorScheme(appTheme),
        LocalTypography!! provides getTypography(appTheme),
        content = content
    )
}

private fun getColorScheme(appTheme: AppTheme) = when (appTheme) {
    AppTheme.SafePath -> dsColorSchemeSafePath
    AppTheme.Client -> dsColorSchemeClient
}

private fun getTypography(appTheme: AppTheme) = when (appTheme) {
    AppTheme.SafePath -> dsTypographySafePath
    AppTheme.Client -> dsTypographySafePath
}
