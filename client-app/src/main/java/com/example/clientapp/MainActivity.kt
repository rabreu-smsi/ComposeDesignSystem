package com.example.clientapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.clientapp.activity.OverrideWelcomeActivity
import com.example.productcore.activity.RewardsActivity
import com.example.productcore.activity.TutorialActivity
import com.example.productcore.activity.WelcomeActivity

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, WelcomeActivity::class.java))
        finish()
    }
}