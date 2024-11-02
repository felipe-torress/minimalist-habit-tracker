package com.example.habittracker.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.habittracker.core.database.dao.GoalDao
import com.example.habittracker.core.database.dao.HabitDao
import com.example.habittracker.core.database.dao.HabitTaskDao
import com.example.habittracker.core.database.model.GoalEntity
import com.example.habittracker.core.database.model.GoalHabitTaskCrossRef
import com.example.habittracker.core.database.model.HabitEntity
import com.example.habittracker.core.database.model.HabitTaskEntity
import com.example.habittracker.core.database.util.DayOfWeekConverter
import com.example.habittracker.core.database.util.HabitColorConverter
import com.example.habittracker.core.database.util.LocalTimeConverter
import com.example.habittracker.core.database.util.ZonedDateTimeConverter

@Database(
    entities = [
        GoalEntity::class,
        HabitTaskEntity::class,
        GoalHabitTaskCrossRef::class,
        HabitEntity::class,
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    ZonedDateTimeConverter::class,
    LocalTimeConverter::class,
    DayOfWeekConverter::class,
    HabitColorConverter::class,
)
internal abstract class HabitTrackerDatabase : RoomDatabase() {
    abstract fun goalDao(): GoalDao
    abstract fun habitDao(): HabitDao
    abstract fun habitTaskDao(): HabitTaskDao
}