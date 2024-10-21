package com.example.habittracker.feature.museum

sealed interface MuseumUIState {
    data object Loading : MuseumUIState
    data object Success : MuseumUIState
}