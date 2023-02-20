package com.example.productapp

import android.app.Application

class ProductApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Theme.setTheme()
    }
}