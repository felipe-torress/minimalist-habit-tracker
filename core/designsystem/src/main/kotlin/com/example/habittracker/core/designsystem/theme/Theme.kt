package com.example.habittracker.core.designsystem.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HabitTrackerTheme(content: @Composable () -> Unit) {
    // Obtain the system UI controller
    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        color = HabitTrackerColors.backgroundColor,
        darkIcons = true
    )

    MaterialTheme(content = content)
}