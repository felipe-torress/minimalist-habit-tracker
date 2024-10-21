package com.example.aesthetic.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.aesthetic.feature.museum.navigation.MUSEUM_ROUTE
import com.example.aesthetic.feature.museum.navigation.museumScreen
import com.example.aesthetic.feature.profile.navigation.profileScreen
import com.example.aesthetic.ui.AestheticAppState

@Composable
fun AestheticNavHost(
    modifier: Modifier = Modifier,
    appState: AestheticAppState,
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