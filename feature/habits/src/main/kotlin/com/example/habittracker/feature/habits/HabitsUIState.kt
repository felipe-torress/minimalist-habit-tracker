package com.example.habittracker.feature.habits

interface HabitsUIState {
    data object Loading : HabitsUIState
    data object Success : HabitsUIState
}