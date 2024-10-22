package com.example.habittracker.feature.habits.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.habittracker.feature.habits.HabitsRoute

const val HABITS_ROUTE = "habits_route"

fun NavController.navigateToHabits(navOptions: NavOptions) = navigate(HABITS_ROUTE, navOptions)

fun NavGraphBuilder.habitsScreen() = composable(route = HABITS_ROUTE) { HabitsRoute() }