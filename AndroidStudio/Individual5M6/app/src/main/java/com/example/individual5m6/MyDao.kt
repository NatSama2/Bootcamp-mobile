package com.example.individual5m6

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MyDao {
    @Insert
    suspend fun insertAll(data: List<MyData>)

    @Query("SELECT * FROM mydata_table")
    suspend fun getAllData(): List<MyData>
}