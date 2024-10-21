package com.example.aesthetic.feature.profile

interface ProfileUIState {
    data object Loading : ProfileUIState
    data object Success : ProfileUIState
}