package com.example.clientapp

import android.app.Application
import com.example.theme.api.AppTheme
import com.example.theme.api.Theme

class ClientApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Theme = AppTheme.Client
    }
}