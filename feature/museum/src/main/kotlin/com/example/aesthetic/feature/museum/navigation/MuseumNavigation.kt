package com.example.aesthetic.feature.museum.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.aesthetic.feature.museum.MuseumRoute

const val MUSEUM_ROUTE = "museum_route"

fun NavController.navigateToMuseum(navOptions: NavOptions) = navigate(MUSEUM_ROUTE, navOptions)

fun NavGraphBuilder.museumScreen() = composable(route = MUSEUM_ROUTE) { MuseumRoute() }
