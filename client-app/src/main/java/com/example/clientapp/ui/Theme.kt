package com.example.clientapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.designsystemlibrary.theme.AppTheme
import com.example.designsystemlibrary.theme.DSColorScheme
import com.example.designsystemlibrary.theme.DSTypography
import com.example.designsystemlibrary.theme.dsColorScheme
import com.example.designsystemlibrary.theme.dsTypography

val clientColorScheme = DSColorScheme(
    background = Color(0xFF262626),
    onBackground = Color(0xFFE0E0E0),
    accent = Color(0xFF226FBB)
)

val clientTypography = DSTypography(
    button = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W800,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
)

@Composable
fun ClientTheme(content: @Composable () -> Unit) {
    dsColorScheme = clientColorScheme
    dsTypography = clientTypography
    AppTheme { content() }
}