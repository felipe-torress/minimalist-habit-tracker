package com.example.habittracker.core.model.data

import java.time.DayOfWeek
import java.time.LocalTime
import java.time.ZonedDateTime

data class HabitTask(
    val id: String,
    val name: String,
    val time: LocalTime,
    val currentWeeklyCompletions: Int,
    val requiredWeeklyCompletions: Int,
    val recurrenceType: RecurrenceType,
    val daysOfWeek: List<DayOfWeek>?,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
)

enum class RecurrenceType {
    // No days of week data needed
    DAILY,

    // Days of week data needed
    WEEKLY
}