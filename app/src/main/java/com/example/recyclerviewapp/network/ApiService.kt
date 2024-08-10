package com.example.recyclerviewapp.network

import com.example.recyclerviewapp.models.Item
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("objects")
    fun getItems(): Call<List<Item>>

    companion object {
        private const val BASE_URL = "https://api.restful-api.dev/"

        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}
