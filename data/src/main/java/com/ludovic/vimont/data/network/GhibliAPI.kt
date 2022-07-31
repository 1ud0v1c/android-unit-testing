package com.ludovic.vimont.data.network

import com.ludovic.vimont.data.entities.Movie
import retrofit2.Response
import retrofit2.http.GET

interface GhibliAPI {
    companion object {
        const val BASE_URL = "https://ghibliapi.herokuapp.com/"
    }

    @GET("films")
    suspend fun getMovies(): Response<List<Movie>>
}