package com.example.habittracker.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.habittracker.core.model.data.Goal
import java.time.ZonedDateTime
import java.util.UUID

/**
 * Defines a Habit Goal.
 * It has a many to many relationship with [HabitTaskEntity]
 */
@Entity(tableName = "goals")
data class GoalEntity(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val name: String,
    val weeks: Int,
    @ColumnInfo(name = "current_completions")
    val currentCompletions: Int,
    @ColumnInfo(name = "required_completions")
    val requiredCompletions: Int,
    val reward: String,
    @ColumnInfo(name = "start_date")
    val startDate: ZonedDateTime,
    @ColumnInfo(name = "created_at")
    val createdAt: ZonedDateTime,
    @ColumnInfo(name = "updated_at")
    val updatedAt: ZonedDateTime,
)

fun GoalEntity.asGoal() = Goal(
    id = id,
    name = name,
    weeks = weeks,
    currentCompletions = currentCompletions,
    requiredCompletions = requiredCompletions,
    reward = reward,
    startDate = startDate,
    createdAt = createdAt,
    updatedAt = updatedAt,
    associatedTask = emptyList()
)
