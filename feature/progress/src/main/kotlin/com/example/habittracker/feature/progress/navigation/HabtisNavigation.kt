package com.example.habittracker.feature.progress.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.habittracker.feature.progress.ProgressRoute

const val PROGRESS_ROUTE = "progress_route"

fun NavController.navigateToProgress(navOptions: NavOptions) = navigate(PROGRESS_ROUTE, navOptions)

fun NavGraphBuilder.progressScreen() = composable(route = PROGRESS_ROUTE) { ProgressRoute() }