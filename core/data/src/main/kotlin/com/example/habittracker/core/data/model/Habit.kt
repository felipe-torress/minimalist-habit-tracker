package com.example.habittracker.core.data.model

import com.example.habittracker.core.database.model.HabitEntity
import com.example.habittracker.core.model.data.Habit

fun Habit.asHabitEntity() = HabitEntity(
    id = id,
    name = name,
    createdAt = createdAt,
    updatedAt = updatedAt,
    color = color
)