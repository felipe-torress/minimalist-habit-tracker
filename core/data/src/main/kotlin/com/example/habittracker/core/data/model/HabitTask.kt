package com.example.habittracker.core.data.model

import com.example.habittracker.core.database.model.HabitTaskEntity
import com.example.habittracker.core.model.data.HabitTask

fun HabitTask.asHabitTaskEntity() = HabitTaskEntity(
    id = id,
    habitId = habitId,
    name = name,
    time = time,
    currentWeeklyCompletions = currentWeeklyCompletions,
    requiredWeeklyCompletions = requiredWeeklyCompletions,
    daysOfWeek = daysOfWeek,
    createdAt = createdAt,
    updatedAt = updatedAt,
)