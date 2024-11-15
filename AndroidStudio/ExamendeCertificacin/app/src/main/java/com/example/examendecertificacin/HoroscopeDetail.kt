package com.example.examendecertificacin

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class HoroscopeDetail(
    @PrimaryKey val id: String,

    @SerializedName("nombre")
    val name: String,

    @SerializedName("fechas")
    val dates: String,

    @SerializedName("elemento")
    val element: String? = null,

    @SerializedName("planetaRegente")
    val rulingPlanet: String? = null,

    @SerializedName("simbolo")
    val symbol: String? = null,

    @SerializedName("color")
    val color: String? = null,

    @SerializedName("logo")
    val imageUrl: String? = null
)