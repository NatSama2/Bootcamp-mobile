package com.example.examendecertificacin

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity
data class HoroscopeDetail(
    @PrimaryKey val id: String,

    @ColumnInfo(name = "nombre")
    val name: String,
    @ColumnInfo(name = "fechas")
    val dates: String,
    @ColumnInfo(name = "elemento")
    val element: String,
    @ColumnInfo(name = "planetaRegente")
    val rulingPlanet: String,
    @ColumnInfo(name = "simbolo")
    val symbol: String,
    @ColumnInfo(name = "color")
    val color: String,
    @ColumnInfo(name = "logo")
    val imageUrl: String
)