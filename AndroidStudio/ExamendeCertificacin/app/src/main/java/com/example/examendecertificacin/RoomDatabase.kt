package com.example.examendecertificacin

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Horoscope::class, HoroscopeDetail::class], version = 1)
abstract class HoroscopeDatabase : RoomDatabase() {
    abstract fun horoscopeDao(): HoroscopeDao

    companion object {
        @Volatile
        private var INSTANCE: HoroscopeDatabase? = null

        fun getInstance(context: Context): HoroscopeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    HoroscopeDatabase::class.java,
                    "horoscope_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}