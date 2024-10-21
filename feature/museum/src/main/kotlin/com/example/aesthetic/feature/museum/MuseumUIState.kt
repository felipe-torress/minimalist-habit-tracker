package com.example.aesthetic.feature.museum

sealed interface MuseumUIState {
    data object Loading : MuseumUIState
    data object Success : MuseumUIState
}