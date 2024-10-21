package com.example.aesthetic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.aesthetic.ui.AestheticApp
import com.example.aesthetic.core.designsystem.theme.AestheticTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AestheticTheme {
                AestheticApp()
            }
        }
    }
}