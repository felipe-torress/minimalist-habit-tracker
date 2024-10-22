package com.example.habittracker.feature.habits

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HabitsViewModel : ViewModel() {
    val uiState: StateFlow<HabitsUIState> = MutableStateFlow(HabitsUIState.Success)
}