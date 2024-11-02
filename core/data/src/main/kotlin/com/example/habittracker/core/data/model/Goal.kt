package com.example.habittracker.core.data.model

import com.example.habittracker.core.database.model.GoalEntity
import com.example.habittracker.core.model.data.Goal

fun Goal.asGoalEntity() = GoalEntity(
    id = id,
    habitId = habitId,
    name = name,
    weeks = weeks,
    currentCompletions = currentCompletions,
    requiredCompletions = requiredCompletions,
    reward = reward,
    startDate = startDate,
    createdAt = createdAt,
    updatedAt = updatedAt,
)