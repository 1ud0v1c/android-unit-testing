package com.ludovic.vimont.domain

import com.ludovic.vimont.domain.model.Movie

class GetGhibliMoviesUseCase(
    private val ghibliRepository: GhibliRepository,
) {
    suspend fun execute(): Result<List<Movie>> {
        return ghibliRepository.getMovies()
    }
}