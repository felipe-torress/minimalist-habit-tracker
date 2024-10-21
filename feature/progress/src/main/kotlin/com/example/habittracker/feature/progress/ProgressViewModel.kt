package com.example.habittracker.feature.progress

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProgressViewModel : ViewModel() {
    val uiState: StateFlow<ProgressUIState> = MutableStateFlow(ProgressUIState.Success)
}