package com.example.individual5m6

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mydata_table")
data class MyData(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String
)