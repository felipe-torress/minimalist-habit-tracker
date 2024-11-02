package com.example.habittracker.core.database.util

import androidx.room.TypeConverter
import com.example.habittracker.core.model.data.HabitColor

internal class HabitColorConverter {
    @TypeConverter
    fun stringToHabitColor(value: String?): HabitColor? = value?.uppercase()?.let(HabitColor::valueOf)

    @TypeConverter
    fun habitColorToString(habitColor: HabitColor?): String? = habitColor?.name?.lowercase()
}