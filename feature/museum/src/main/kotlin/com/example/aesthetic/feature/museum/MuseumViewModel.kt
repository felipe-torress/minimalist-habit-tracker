package com.example.habittracker.feature.museum

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MuseumViewModel : ViewModel() {
    val uiState: StateFlow<MuseumUIState> = MutableStateFlow(MuseumUIState.Success)
}