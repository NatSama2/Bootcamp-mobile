package com.example.examendecertificacin

import com.example.examendecertificacin.ApiService
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*

class ApiServiceTest {

    private val apiService: ApiService = Retrofit.Builder()
        .baseUrl("https://zodiac-api-two.vercel.app/es/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    @Test
    fun testGetHoroscopeDetail() = runBlocking {
        val response = apiService.getHoroscopeDetail("aries")
        assertTrue(response.isSuccessful)
        assertNotNull(response.body())
    }
}