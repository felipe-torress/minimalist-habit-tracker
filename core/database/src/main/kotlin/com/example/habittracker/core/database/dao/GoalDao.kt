package com.example.habittracker.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.habittracker.core.database.model.GoalEntity
import com.example.habittracker.core.database.model.PopulatedGoal
import com.example.habittracker.core.model.data.Goal
import kotlinx.coroutines.flow.Flow

/**
 * DAO for [Goal] and [GoalEntity] access
 */
@Dao
interface GoalDao {

    /**
     * Fetches all the goals of the user by descending order of creationDate
     */
    @Query(value = "SELECT * FROM goals ORDER BY created_at DESC")
    fun getAllGoals() : Flow<List<PopulatedGoal>>

    /**
     * Fetches a goal by its id
     */
    @Query(value = "SELECT * FROM goals WHERE id = :goalId")
    fun getGoalById(goalId: String) : Flow<List<PopulatedGoal>>

    /**
     * Fetches all the goals of the user related to a given Habit
     */
    @Query(value = "SELECT * FROM goals WHERE habit_id = :habitId")
    fun getGoalsForHabit(habitId: String): Flow<List<PopulatedGoal>>
}
