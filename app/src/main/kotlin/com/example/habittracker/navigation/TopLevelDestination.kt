package com.example.habittracker.navigation

import androidx.annotation.DrawableRes
import com.example.habittracker.core.designsystem.R as designSystemR
import com.example.habittracker.feature.habits.R as habitsR
import com.example.habittracker.feature.home.R as homeR
import com.example.habittracker.feature.profile.R as profileR
import com.example.habittracker.feature.progress.R as progressR

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val title: Int,
    @DrawableRes val icon: Int,
) {
    HOME(
        title = homeR.string.feature_home_title,
        icon = designSystemR.drawable.core_designsystem_ic_house_24dp,
    ),
    HABITS(
        title = habitsR.string.feature_habits_title,
        icon = designSystemR.drawable.core_designsystem_ic_goal_24dp,
    ),
    PROGRESS(
        title = progressR.string.feature_progress_title,
        icon = designSystemR.drawable.core_designsystem_ic_flame_24dp,
    ),
    PROFILE(
        title = profileR.string.feature_profile_title,
        icon = designSystemR.drawable.core_designsystem_ic_user_round_24dp,
    )
}
