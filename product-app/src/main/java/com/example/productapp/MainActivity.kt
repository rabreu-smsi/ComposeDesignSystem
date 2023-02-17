package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.productcore.ui.screen.TutorialScreen
import com.example.theme.api.DSAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, com.example.productcore.MainActivity::class.java))
        finish()
    }
}