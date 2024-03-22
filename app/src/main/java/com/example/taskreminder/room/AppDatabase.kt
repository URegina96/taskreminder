package com.example.taskreminder.room

import android.arch.persistence.room.Database

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase {
    abstract fun taskDao():TaskDAO
}