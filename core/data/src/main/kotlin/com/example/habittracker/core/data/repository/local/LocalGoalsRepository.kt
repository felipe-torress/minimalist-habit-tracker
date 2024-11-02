package com.example.habittracker.core.data.repository.local

import com.example.habittracker.core.data.model.asGoalEntity
import com.example.habittracker.core.data.repository.GoalsRepository
import com.example.habittracker.core.database.dao.GoalDao
import com.example.habittracker.core.database.model.PopulatedGoal
import com.example.habittracker.core.database.model.asGoal
import com.example.habittracker.core.model.data.Goal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalGoalsRepository @Inject constructor(
    private val goalDao: GoalDao
) : GoalsRepository {

    override suspend fun createGoal(goal: Goal) = goalDao.insertGoal(goal.asGoalEntity())

    override suspend fun deleteGoal(goalId: String) = goalDao.deleteGoal(goalId)

    override fun getAllGoals(): Flow<List<Goal>> = goalDao.getAllGoals().map { goalEntities ->
        goalEntities.map(PopulatedGoal::asGoal)
    }

    override fun getGoalById(goalId: String): Flow<Goal> = goalDao.getGoalById(goalId).map { goalEntity ->
        goalEntity.asGoal()
    }

    override fun getGoalsForHabit(habitId: String): Flow<List<Goal>> = goalDao.getGoalsForHabit(habitId).map { habitEntities ->
        habitEntities.map(PopulatedGoal::asGoal)
    }
}