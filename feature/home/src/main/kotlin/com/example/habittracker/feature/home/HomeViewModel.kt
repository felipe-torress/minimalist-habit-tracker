package com.example.habittracker.feature.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {
    val uiState: StateFlow<HomeUIState> = MutableStateFlow(HomeUIState.Success)
}