package com.example.designsystemlibrary.component.exposed.navbar

data class NavBarAction(
    val imageResId: Int,
    val onClick: () -> Unit,
    val contentDescription: String? = null
)