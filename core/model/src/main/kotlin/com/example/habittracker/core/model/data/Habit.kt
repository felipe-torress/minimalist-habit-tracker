package com.example.habittracker.core.model.data

import java.time.ZonedDateTime

data class Habit(
    val id: String,
    val name: HabitColor,
    val color: String,
    val tasks: List<HabitTask>,
    val goal: Goal?,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
)

enum class HabitColor {
    BLUE,
    GREEN,
    PURPLE,
}
