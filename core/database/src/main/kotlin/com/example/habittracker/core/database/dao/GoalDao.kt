package com.example.habittracker.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.habittracker.core.model.data.Goal
import kotlinx.coroutines.flow.Flow

/**
 * DAO for [Goal]  and [GoalEntity] access
 */
@Dao
interface GoalDao {

    /**
     * Fetches all the goals from the user
     */
    @Query(value = "SELECT * FROM goals ORDER BY created_at DESC")
    fun getGoals() : Flow<List<Goal>>
}
