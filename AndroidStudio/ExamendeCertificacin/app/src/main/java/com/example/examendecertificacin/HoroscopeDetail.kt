package com.example.examendecertificacin

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

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

    @SerializedName("imagen")
    val imageUrl: String? = null,

    @SerializedName("fortalezas")
    val strengths: List<String>? = null,

    @SerializedName("debilidades")
    val weaknesses: List<String>? = null,

    @SerializedName("descripcion")
    val description: String? = null,

    @SerializedName("compatibilidad")
    val compatibility: List<String>? = null
)

class Converters {
    @TypeConverter
    fun fromStringList(value: List<String>?): String? {
        return Gson().toJson(value)
    }

    // Convertir un string en una lista
    @TypeConverter
    fun toStringList(value: String?): List<String>? {
        val listType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(value, listType)
    }
}