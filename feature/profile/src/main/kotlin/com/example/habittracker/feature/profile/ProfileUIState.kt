package com.example.habittracker.feature.profile

interface ProfileUIState {
    data object Loading : ProfileUIState
    data object Success : ProfileUIState
}