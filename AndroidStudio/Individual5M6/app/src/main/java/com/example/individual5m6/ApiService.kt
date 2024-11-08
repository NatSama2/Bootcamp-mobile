package com.example.individual5m6

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("realestate")
    suspend fun getData(): Response<List<MyData>>

    companion object {
        fun create(): ApiService {
            // Implementación para crear y devolver una instancia de Retrofit
        }
    }
}