package com.ludovic.vimont.domain

import com.ludovic.vimont.domain.model.Movie

class GetGhibliMoviesUseCase(
    private val ghibliRepository: GhibliRepository,
) {
    suspend operator fun invoke(): Result<List<Movie>> {
        return ghibliRepository.getMovies()
    }
}