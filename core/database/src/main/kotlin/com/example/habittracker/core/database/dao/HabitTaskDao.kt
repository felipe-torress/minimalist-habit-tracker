package com.example.habittracker.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.habittracker.core.database.model.HabitTaskEntity
import kotlinx.coroutines.flow.Flow

/**
 * DAO for [HabitTask] and [HabitTaskEntity] access
 */
@Dao
interface HabitTaskDao {

    /**
     * Inserts a new Goal
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHabitTask(goal: HabitTaskEntity)

    /**
     * Deletes a Goal
     */
    @Query("DELETE FROM habit_tasks WHERE id = :habitTaskId")
    suspend fun deleteHabitTask(habitTaskId: String)

    /**
     * Fetches all the habit tasks of the user by descending order of creationDate
     */
    @Query(value = "SELECT * FROM habit_tasks ORDER BY created_at DESC")
    fun getAllHabitTasks(): Flow<List<HabitTaskEntity>>

    /**
     * Fetches a habit task by its id
     */
    @Query(value = "SELECT * FROM habit_tasks WHERE id = :taskId")
    fun getHabitTaskById(taskId: String): Flow<HabitTaskEntity>

    /**
     * Fetches all the tasks related to a given Habit
     */
    @Query(value = "SELECT * FROM habit_tasks WHERE habit_id = :habitId")
    fun getHabitTasksFromHabit(habitId: String): Flow<List<HabitTaskEntity>>
}
