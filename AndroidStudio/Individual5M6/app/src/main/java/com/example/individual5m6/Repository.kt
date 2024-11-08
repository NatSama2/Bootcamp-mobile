package com.example.individual5m6

import retrofit2.Response

class Repository {
    private val apiService = ApiService.create()

    suspend fun getDataFromApi(): Response<List<MyData>> {
        return apiService.getData()
    }

    fun saveDataToDatabase(data: List<MyData>) {
        // Aquí se implementa la lógica para guardar datos en Room
    }
}