package com.example.examendecertificacin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HoroscopeRepository(private val apiService: ApiService, private val database: HoroscopeDatabase) {

    suspend fun getHoroscopes() = withContext(Dispatchers.IO) {
        val response = apiService.getHoroscopes()
        if (response.isSuccessful) {
            response.body()?.let { horoscopes ->
                // Imprime la respuesta de la API para verificar los datos
                println("Horoscopes response: $horoscopes")
                val processedHoroscopes = horoscopes.map { apiResponse ->
                    Horoscope(
                        id = apiResponse.id,
                        name = apiResponse.name ?: "Desconocido",
                        dates = apiResponse.dates ?: "Fecha no disponible",
                        element = apiResponse.element ?: "Elemento desconocido",
                        rulingPlanet = apiResponse.rulingPlanet ?: "Planeta desconocido",
                        symbol = apiResponse.symbol ?: "Símbolo no disponible",
                        color = apiResponse.color ?: "#FFFFFF",
                        imageUrl = apiResponse.imageUrl ?: ""
                    )
                }
                database.horoscopeDao().insertAll(processedHoroscopes)
            }
        } else {
            println("API Error: ${response.code()}")
        }
        database.horoscopeDao().getAllHoroscopes()
    }

    suspend fun getHoroscopeDetail(id: String): HoroscopeDetail? = withContext(Dispatchers.IO) {
        val response = apiService.getHoroscopeDetail(id)

        if (response.isSuccessful) {
            response.body()?.let { horoscopeDetail ->
                // Guarda el detalle en la base de datos local si es necesario
                database.horoscopeDao().insertHoroscopeDetail(horoscopeDetail)
                return@withContext horoscopeDetail
            }
        }

        // Si la API falla, intenta obtener el detalle desde la base de datos local
        return@withContext database.horoscopeDao().getHoroscopeDetail(id)
    }
}