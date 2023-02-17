package com.example.theme.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal

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

