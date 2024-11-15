package com.example.examendecertificacin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface HoroscopeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(horoscopes: List<Horoscope>)

    @Query("SELECT * FROM Horoscope")
    suspend fun getAllHoroscopes(): List<Horoscope>


    @Query("SELECT * FROM HoroscopeDetail WHERE id = :id")
    suspend fun getHoroscopeDetail(id: String): HoroscopeDetail?


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHoroscopeDetail(horoscopeDetail: HoroscopeDetail)
}