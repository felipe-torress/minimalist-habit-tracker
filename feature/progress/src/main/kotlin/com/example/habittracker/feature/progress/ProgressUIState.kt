package com.example.habittracker.feature.progress

interface ProgressUIState {
    data object Loading : ProgressUIState
    data object Success : ProgressUIState
}