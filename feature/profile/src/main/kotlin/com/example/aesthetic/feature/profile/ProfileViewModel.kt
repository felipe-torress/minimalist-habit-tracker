package com.example.aesthetic.feature.profile

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProfileViewModel : ViewModel() {
    val uiState: StateFlow<ProfileUIState> = MutableStateFlow(ProfileUIState.Success)
}