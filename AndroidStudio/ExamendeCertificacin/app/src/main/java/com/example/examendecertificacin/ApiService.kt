package com.example.examendecertificacin

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("sign")
    suspend fun getHoroscopes(): Response<List<Horoscope>>

    @GET("sign/{id}")
    suspend fun getHoroscopeDetail(@Path("id") id: String): Response<HoroscopeDetail>

    companion object {
        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://zodiac-api-two.vercel.app/es/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}