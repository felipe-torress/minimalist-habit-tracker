package com.example.habittracker.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.habittracker.feature.museum.navigation.MUSEUM_ROUTE
import com.example.habittracker.feature.museum.navigation.museumScreen
import com.example.habittracker.feature.profile.navigation.profileScreen
import com.example.habittracker.ui.AppState

@Composable
fun NavHost(
    modifier: Modifier = Modifier,
    appState: AppState,
    startDestination: String = MUSEUM_ROUTE,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        museumScreen()
        profileScreen()
    }
}