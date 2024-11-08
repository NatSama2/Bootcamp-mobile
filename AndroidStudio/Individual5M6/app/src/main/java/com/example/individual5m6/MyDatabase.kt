package com.example.individual5m6

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MyData::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {
    abstract fun myDao(): MyDao
}