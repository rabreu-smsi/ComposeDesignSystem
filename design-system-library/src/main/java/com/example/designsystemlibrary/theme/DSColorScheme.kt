package com.example.designsystemlibrary.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DSColorScheme(
    val main: Color = Color(0xFF5B667C),
    val onMain: Color = Color(0xFFFFFFFF),
    val onMainSecondary: Color = Color(0xFFFFFFBF),
    val onMainDisabled: Color = Color(0xFFFFFF80),
    val onMainLight: Color = Color(0xFFFFFF26),
    val onMainExtraLight: Color = Color(0xFFFFFF14),
    val accent: Color = Color(0xFF29AB87),
    val onAccent: Color = Color(0xFFFFFFFF),
    val onAccentSecondary: Color = Color(0xFFFFFFD9),
    val onAccentDisabled: Color = Color(0xFFFFFFA6),
    val onAccentLight: Color = Color(0xFFFFFF3D),
    val onAccentExtraLight: Color = Color(0xFFFFFF1F),
    val accentHighContrast: Color = Color(0xFF0F8564),
    val background: Color = Color(0xFFFFFFFF),
    val onBackground: Color = Color(0xFF000000),
    val onBackgroundSecondary: Color = Color(0xFF5B667C),
    val onBackgroundDisabled: Color = Color(0xFF8F99AB),
    val onBackgroundLight: Color = Color(0xFFDCDEE2),
    val onBackgroundExtraLight: Color = Color(0xFFF8F8F8),
    val surface: Color = Color(0xFFFFFFFF),
    val onSurface: Color = Color(0xFF000000),
    val onSurfaceSecondary: Color = Color(0xFF5B667C),
    val onSurfaceDisabled: Color = Color(0xFF8F99AB),
    val onSurfaceLight: Color = Color(0xFFDCDEE2),
    val onSurfaceExtraLight: Color = Color(0xFFF8F8F8),
    val premium: Color = Color(0xFF276AE8),
    val onPremium: Color = Color(0xFFFFFFFF),
    val onPremiumSecondary: Color = Color(0xFFFFFFBF),
    val onPremiumDisabled: Color = Color(0xFFFFFF80),
    val onPremiumLight: Color = Color(0xFFFFFF33),
    val onPremiumExtraLight: Color = Color(0xFFFFFF1A),
    val critical: Color = Color(0xFFB72026),
    val onCritical: Color = Color(0xFFFFFFFF),
    val onCriticalSecondary: Color = Color(0xFFFFFFBF),
    val onCriticalDisabled: Color = Color(0xFFFFFF80),
    val onCriticalLight: Color = Color(0xFFFFFF33),
    val onCriticalExtraLight: Color = Color(0xFFFFFF1A),
    val attention: Color = Color(0xFFFFDA6D),
    val onAttention: Color = Color(0xFF04121A),
    val onAttentionSecondary: Color = Color(0x04121ABF),
    val onAttentionDisabled: Color = Color(0x04121A80),
    val onAttentionLight: Color = Color(0x04121A33),
    val onAttentionExtraLight: Color = Color(0x04121A1A),
    val success: Color = Color(0xFF669900),
    val onSuccess: Color = Color(0xFFFFFFFF),
    val onSuccessSecondary: Color = Color(0xFFFFFFBF),
    val onSuccessDisabled: Color = Color(0xFFFFFF80),
    val onSuccessLight: Color = Color(0xFFFFFF33),
    val onSuccessExtraLight: Color = Color(0xFFFFFF1A),
    val brand: Color = Color(0xFFF1602F),
    val onBrand: Color = Color(0xFFFFFFFF),
    val onBrandSecondary: Color = Color(0xFFFFFFBF),
    val onBrandDisabled: Color = Color(0xFFFFFF80),
    val onBrandLight: Color = Color(0xFFFFFF33),
    val onBrandExtraLight: Color = Color(0xFFFFFF1A),
    val brand1: Color = Color(0xFF8BCEE2),
    val onBrand1: Color = Color(0xFF000000),
    val onBrand1Secondary: Color = Color(0x000000BF),
    val onBrand1Disabled: Color = Color(0x00000080),
    val onBrand1Light: Color = Color(0x00000033),
    val onBrand1ExtraLight: Color = Color(0x0000001A)
)