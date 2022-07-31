package com.ludovic.vimont.domain

import com.ludovic.vimont.domain.model.Movie

interface GhibliRepository {
    suspend fun getMovies(): Result<List<Movie>>
}