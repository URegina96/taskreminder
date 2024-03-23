package com.example.taskreminder.room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "task")
data class Task (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title:String,
    val description:String,
    val time:Int,
    val  isCompleted:String
)