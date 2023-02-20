package com.example.clientapp

import android.app.Application
import com.example.clientapp.ui.clientColorScheme
import com.example.clientapp.ui.clientTypography
import com.example.designsystemlibrary.theme.dsColorScheme
import com.example.designsystemlibrary.theme.dsTypography

class ClientApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        dsColorScheme = clientColorScheme
        dsTypography = clientTypography
    }
}