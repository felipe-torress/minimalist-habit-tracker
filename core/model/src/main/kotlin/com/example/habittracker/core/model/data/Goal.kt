package com.example.habittracker.core.model.data

import java.time.ZonedDateTime

data class Goal(
    val id: String,
    val habitId: String,
    val name: String,
    val weeks: Int,
    val currentCompletions: Int,
    val requiredCompletions: Int,
    val reward: String,
    val startDate: ZonedDateTime,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val associatedTask: List<HabitTask>
)
