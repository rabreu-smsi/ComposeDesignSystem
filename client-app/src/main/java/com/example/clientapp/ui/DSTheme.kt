package com.example.clientapp.ui

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.designsystemlibrary.theme.DSColorScheme
import com.example.designsystemlibrary.theme.DSTypography
import com.example.designsystemlibrary.theme.LocalColorScheme
import com.example.designsystemlibrary.theme.LocalTypography

private val colorScheme = DSColorScheme(
    accent = Color(0xFF226FBB)
)

private val typography = DSTypography(
    button = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W800,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
)

@Composable
fun ClientTheme(content: @Composable () -> Unit) {
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