package com.ludovic.vimont.domain

import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.random.Random

class GetGhibliMoviesUseCaseTest {
    private val ghibliRepository = mockk<GhibliRepository>()
    private val getGhibliMoviesUseCase = GetGhibliMoviesUseCase(ghibliRepository)

    @Test
    fun `useCase should return Result_success(), when repository succeed`() = runTest {
        // Given
        val movies = Random.nextMovies()
        coEvery {
            ghibliRepository.getMovies()
        } returns Result.success(movies)

        // When
        val result = getGhibliMoviesUseCase.invoke()

        // Then
        Assert.assertEquals(
            movies,
            result.getOrThrow()
        )
    }

    @Test
    fun `useCase should return Result_failure(), when repository failed`() = runTest {
        // Given
        val exception = IllegalArgumentException("An error occurred while fetching the list of movies")
        coEvery {
            ghibliRepository.getMovies()
        } returns Result.failure(exception)

        // When
        val result = getGhibliMoviesUseCase.invoke()

        // Then
        Assert.assertEquals(
            exception,
            result.exceptionOrNull()
        )
    }
}