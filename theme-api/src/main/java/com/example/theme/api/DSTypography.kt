package com.example.theme.api

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

@Immutable
data class DSTypography(
    val H1: TextStyle,
    val H2: TextStyle,
    val H3: TextStyle,
    val H4: TextStyle,
    val H5: TextStyle,
    val H6: TextStyle,
    val Body1: TextStyle,
    val Body2: TextStyle,
    val Caption: TextStyle,
    val Button: TextStyle,
    val ButtonSmall: TextStyle,
    val LinkBody1: TextStyle,
    val LinkBody2: TextStyle,
    val LinkCaption: TextStyle
)