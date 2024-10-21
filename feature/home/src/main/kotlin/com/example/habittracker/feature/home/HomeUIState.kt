package com.example.habittracker.feature.home

sealed interface HomeUIState {
    data object Loading : HomeUIState
    data object Success : HomeUIState
}