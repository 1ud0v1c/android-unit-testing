package com.ludovic.vimont.data.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit

object RetrofitBuilder {
    fun <T> buildAPI(apiURL: String, apiClass: Class<T>): T {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(apiURL)
            .addConverterFactory(Json.asConverterFactory(MediaType.get("application/json")))
            .build()
        return retrofit.create(apiClass)
    }
}