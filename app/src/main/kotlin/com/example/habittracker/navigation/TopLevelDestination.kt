package com.example.habittracker.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.habittracker.feature.home.R as homeR
import com.example.habittracker.feature.profile.R as profileR
import com.example.habittracker.core.designsystem.icon.HabitTrackerIcons

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
) {
    HOME(
        selectedIcon = HabitTrackerIcons.AddSelected,
        unselectedIcon = HabitTrackerIcons.AddUnselected,
        iconTextId = homeR.string.feature_home_title,
    ),
    PROFILE(
        selectedIcon = HabitTrackerIcons.PersonSelected,
        unselectedIcon = HabitTrackerIcons.PersonUnselected,
        iconTextId = profileR.string.feature_profile_title,
    )
}
