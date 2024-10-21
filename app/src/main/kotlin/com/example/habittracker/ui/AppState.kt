package com.example.habittracker.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import androidx.tracing.trace
import com.example.habittracker.feature.museum.navigation.MUSEUM_ROUTE
import com.example.habittracker.feature.museum.navigation.navigateToMuseum
import com.example.habittracker.feature.profile.navigation.PROFILE_ROUTE
import com.example.habittracker.feature.profile.navigation.navigateToProfile
import com.example.habittracker.navigation.TopLevelDestination
import com.example.habittracker.navigation.TopLevelDestination.MUSEUM
import com.example.habittracker.navigation.TopLevelDestination.PROFILE

@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController()
): AppState =
    remember(navController) { AppState(navController) }

@Stable
class AppState(val navController: NavHostController) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            MUSEUM_ROUTE -> MUSEUM
            PROFILE_ROUTE -> PROFILE
            else -> null
        }

    /**
     * Map of top level destinations to be used in the TopBar, BottomBar and NavRail. The key is the
     * route.
     */
    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        trace("Navigation: ${topLevelDestination.name}") {
            val topLevelNavOptions = navOptions {
                // Pop up to the start destination of the graph to
                // avoid building up a large stack of destinations
                // on the back stack as users select items
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                // Avoid multiple copies of the same destination when
                // reselecting the same item
                launchSingleTop = true
                // Restore state when reselecting a previously selected item
                restoreState = true
            }

            when (topLevelDestination) {
                MUSEUM -> navController.navigateToMuseum(topLevelNavOptions)
                PROFILE -> navController.navigateToProfile(topLevelNavOptions)
            }
        }
    }
}