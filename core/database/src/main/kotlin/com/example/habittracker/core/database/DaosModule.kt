package com.example.habittracker.core.database

import com.example.habittracker.core.database.dao.GoalDao
import com.example.habittracker.core.database.dao.HabitDao
import com.example.habittracker.core.database.dao.HabitTaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal object DaosModule {
    @Provides
    fun providesGoalDao(
        database: HabitTrackerDatabase
    ): GoalDao = database.goalDao()

    @Provides
    fun providesHabitDao(
        database: HabitTrackerDatabase
    ): HabitDao = database.habitDao()

    @Provides
    fun providesHabitTaskDao(
        database: HabitTrackerDatabase
    ): HabitTaskDao = database.habitTaskDao()
}