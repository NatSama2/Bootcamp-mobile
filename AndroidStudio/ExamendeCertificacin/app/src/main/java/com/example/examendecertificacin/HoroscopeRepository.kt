package com.example.examendecertificacin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HoroscopeRepository(private val apiService: ApiService, private val database: HoroscopeDatabase) {

    // Obtiene la lista de horóscopos
    suspend fun getHoroscopes() = withContext(Dispatchers.IO) {
        val response = apiService.getHoroscopes()
        if (response.isSuccessful) {
            response.body()?.let { horoscopes ->
                // Imprime la respuesta de la API para verificar los datos
                println("Horoscopes response: $horoscopes")

                // Procesa los datos de la API, asegurando que los valores no sean nulos
                val processedHoroscopes = horoscopes.map { apiResponse ->
                    Horoscope(
                        id = apiResponse.id,
                        name = apiResponse.name ?: "Desconocido", // Si el nombre es nulo, asignar valor por defecto
                        dates = apiResponse.dates ?: "Fecha no disponible", // Si las fechas son nulas, asignar valor por defecto
                        element = apiResponse.element ?: "Elemento desconocido", // Lo mismo para el elemento
                        rulingPlanet = apiResponse.rulingPlanet ?: "Planeta desconocido", // Lo mismo para el planeta regente
                        symbol = apiResponse.symbol ?: "Símbolo no disponible", // Lo mismo para el símbolo
                        color = apiResponse.color ?: "#FFFFFF", // Si el color es nulo, asignar blanco por defecto
                        imageUrl = apiResponse.imageUrl ?: "" // Si la URL de la imagen es nula, dejarla vacía
                    )
                }

                // Inserta los horóscopos procesados en la base de datos
                database.horoscopeDao().insertAll(processedHoroscopes)
            }
        } else {
            println("API Error: ${response.code()}")
        }

        // Retorna todos los horóscopos de la base de datos local
        database.horoscopeDao().getAllHoroscopes()
    }

    // Obtiene el detalle de un horóscopo por su id
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