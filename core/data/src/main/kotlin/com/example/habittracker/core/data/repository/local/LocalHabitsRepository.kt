package com.example.habittracker.core.data.repository.local

import com.example.habittracker.core.data.model.asHabitEntity
import com.example.habittracker.core.data.repository.HabitsRepository
import com.example.habittracker.core.database.dao.HabitDao
import com.example.habittracker.core.database.model.PopulatedHabit
import com.example.habittracker.core.database.model.asHabit
import com.example.habittracker.core.model.data.Habit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalHabitsRepository @Inject constructor(
    private val habitDao: HabitDao
) : HabitsRepository {

    override suspend fun createHabit(habit: Habit) = habitDao.insertHabit(habit.asHabitEntity())

    override suspend fun deleteHabit(habitId: String) = habitDao.deleteHabit(habitId)

    override fun getAllHabits(): Flow<List<Habit>> = habitDao.getAllHabits().map { habitEntities ->
        habitEntities.map(PopulatedHabit::asHabit)
    }

    override fun getHabitById(habitId: String): Flow<Habit> = habitDao.getHabitById(habitId).map { habitEntity ->
        habitEntity.asHabit()
    }
}