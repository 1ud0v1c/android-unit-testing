package com.ludovic.vimont.data

import com.ludovic.vimont.data.mappers.toModel
import com.ludovic.vimont.data.network.GhibliAPI
import com.ludovic.vimont.domain.GhibliRepository
import com.ludovic.vimont.domain.model.Movie

class GhibliRepositoryImpl(
    private val ghibliAPI: GhibliAPI,
): GhibliRepository {
    override suspend fun getMovies(): Result<List<Movie>> {
        val movies = mutableListOf<Movie>()
        try {
            val moviesResponse = ghibliAPI.getMovies()
            if (!moviesResponse.isSuccessful) {
                return Result.failure(IllegalAccessException("The request failed"))
            }
            moviesResponse.body()?.let {
                movies.addAll(it.toModel())
            }
            return Result.success(movies)
        } catch (exception: Exception) {
            return Result.failure(exception)
        }
    }
}