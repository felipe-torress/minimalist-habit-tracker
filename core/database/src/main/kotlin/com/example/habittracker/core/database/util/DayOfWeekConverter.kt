package com.example.habittracker.core.database.util

import androidx.room.TypeConverter
import java.time.DayOfWeek

internal class DayOfWeekConverter {
    @TypeConverter
    fun intToDayOfWeek(value: Int?): DayOfWeek? = value?.let(DayOfWeek::of)

    @TypeConverter
    fun dayOfWeekToIsoInt(dayOfWeek: DayOfWeek?): Int? = dayOfWeek?.value
}