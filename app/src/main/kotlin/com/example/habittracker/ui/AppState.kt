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
import com.example.habittracker.feature.habits.navigation.navigateToHabits
import com.example.habittracker.feature.home.navigation.HOME_ROUTE
import com.example.habittracker.feature.home.navigation.navigateToHome
import com.example.habittracker.feature.profile.navigation.PROFILE_ROUTE
import com.example.habittracker.feature.profile.navigation.navigateToProfile
import com.example.habittracker.feature.progress.navigation.navigateToProgress
import com.example.habittracker.navigation.TopLevelDestination
import com.example.habittracker.navigation.TopLevelDestination.HABITS
import com.example.habittracker.navigation.TopLevelDestination.HOME
import com.example.habittracker.navigation.TopLevelDestination.PROFILE
import com.example.habittracker.navigation.TopLevelDestination.PROGRESS

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
            HOME_ROUTE -> HOME
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
                HOME -> navController.navigateToHome(topLevelNavOptions)
                HABITS -> navController.navigateToHabits(topLevelNavOptions)
                PROGRESS -> navController.navigateToProgress(topLevelNavOptions)
                PROFILE -> navController.navigateToProfile(topLevelNavOptions)
            }
        }
    }
}