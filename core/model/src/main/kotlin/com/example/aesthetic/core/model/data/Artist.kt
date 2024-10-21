package com.example.aesthetic.core.model.data

import java.time.LocalDate

data class Artist(
    val id: String,
    val name: String,
    val birthday: LocalDate,
    val biography: String?
)
