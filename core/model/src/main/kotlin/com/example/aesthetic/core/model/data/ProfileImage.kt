package com.example.aesthetic.core.model.data

import java.time.ZonedDateTime

data class ProfileImage(
    val id: String,
    val artistId: String,
    val imageData: String,
    val updateDateTime: ZonedDateTime
)
