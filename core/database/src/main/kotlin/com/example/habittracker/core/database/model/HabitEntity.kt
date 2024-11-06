package com.example.habittracker.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.habittracker.core.model.data.Habit
import com.example.habittracker.core.model.data.HabitColor
import java.time.ZonedDateTime
import java.util.UUID

/**
 * Defines a Habit.
 * It has a one to many relationship with [HabitTaskEntity] and [GoalEntity]
 */
@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val name: String,
    val color: HabitColor,
    @ColumnInfo(name = "created_at")
    val createdAt: ZonedDateTime,
    @ColumnInfo(name = "updated_at")
    val updatedAt: ZonedDateTime,
)

fun HabitEntity.asHabit() = Habit(
    id = id,
    name = name,
    createdAt = createdAt,
    updatedAt = updatedAt,
    color = color,
    tasks = emptyList(),
    goals = emptyList(),
)
