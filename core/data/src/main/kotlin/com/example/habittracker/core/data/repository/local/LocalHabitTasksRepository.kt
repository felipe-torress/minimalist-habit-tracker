package com.example.habittracker.core.data.repository.local

import com.example.habittracker.core.data.model.asHabitTaskEntity
import com.example.habittracker.core.data.repository.HabitTasksRepository
import com.example.habittracker.core.database.dao.HabitTaskDao
import com.example.habittracker.core.database.model.HabitTaskEntity
import com.example.habittracker.core.database.model.asHabitTask
import com.example.habittracker.core.model.data.HabitTask
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalHabitTasksRepository @Inject constructor(
    private val habitTaskDao: HabitTaskDao
) : HabitTasksRepository {

    override suspend fun createHabitTask(habitTask: HabitTask) = habitTaskDao.insertHabitTask(habitTask.asHabitTaskEntity())

    override suspend fun deleteHabitTask(habitTaskId: String) = habitTaskDao.deleteHabitTask(habitTaskId)

    override fun getAllHabitTasks(): Flow<List<HabitTask>> = habitTaskDao.getAllHabitTasks().map { habitTaskEntities ->
        habitTaskEntities.map(HabitTaskEntity::asHabitTask)
    }

    override fun getHabitTaskById(habitTaskId: String): Flow<HabitTask> = habitTaskDao.getHabitTaskById(habitTaskId).map { habitTaskEntity ->
        habitTaskEntity.asHabitTask()
    }

    override fun getHabitTasksFromHabit(habitId: String): Flow<List<HabitTask>> = habitTaskDao.getHabitTasksFromHabit(habitId).map { habitEntities ->
        habitEntities.map(HabitTaskEntity::asHabitTask)
    }
}