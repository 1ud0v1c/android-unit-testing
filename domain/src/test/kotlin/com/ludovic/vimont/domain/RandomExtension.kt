package com.ludovic.vimont.domain

import com.ludovic.vimont.domain.model.Movie
import java.util.Calendar
import kotlin.random.Random

private const val STRING_LENGTH: Int = 30
private const val LETTER = "abcdefghijklmnopqrstuvwxyz"
private const val DIGIT = "0123456789"

fun Random.nextString(
    size: Int = STRING_LENGTH,
): String {
    val stringSize = if (size > 0) size else STRING_LENGTH
    val dataSet = LETTER + DIGIT
    return (1..stringSize)
        .map { Random.nextInt(0, dataSet.length) }
        .map(dataSet::get)
        .joinToString("")
}

fun Random.nextMovies(
    size: Int = Random.nextInt(1, 30)
): List<Movie> {
    return List(size) {
        Random.nextMovie()
    }
}

fun Random.nextMovie(
    id: String = Random.nextString(),
    name: String = Random.nextString(),
    title: String = Random.nextString(),
    movieBanner: String = Random.nextString(),
    director: String = Random.nextString(),
    producer: String = Random.nextString(),
    releaseDate: Int = Random.nextInt(1900, Calendar.getInstance().get(Calendar.YEAR))
): Movie {
    return Movie(
        id = id,
        name = name,
        title = title,
        movieBanner = movieBanner,
        director = director,
        producer = producer,
        releaseDate = releaseDate
    )
}