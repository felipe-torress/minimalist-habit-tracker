package com.example.habittracker.core.data.repository

import com.example.habittracker.core.model.data.Habit
import com.example.habittracker.core.model.data.HabitTask
import kotlinx.coroutines.flow.Flow

interface HabitTasksRepository {

    /**
     * Creates a new [HabitTask]
     */
    suspend fun createHabitTask(habitTask: HabitTask)

    /**
     * Deletes a [HabitTask]
     */
    suspend fun deleteHabitTask(habitTaskId: String)

    /**
     * Gets all [HabitTask]s from the user
     */
    fun getAllHabitTasks(): Flow<List<HabitTask>>

    /**
     * Gets a [HabitTask] by it's id
     */
    fun getHabitTaskById(habitTaskId: String): Flow<HabitTask>

    /**
     * Gets all [HabitTask]s related to a given [Habit]
     */
    fun getHabitTasksFromHabit(habitId: String): Flow<List<HabitTask>>
}