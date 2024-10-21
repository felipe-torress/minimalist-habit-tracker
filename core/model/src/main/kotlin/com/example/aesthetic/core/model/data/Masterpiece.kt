package com.example.habittracker.core.model.data

import java.time.ZonedDateTime

data class Masterpiece(
    val id: String,
    val name: String,
    val description: String,
    val imageData: String?,
    val publishDate: ZonedDateTime
)
