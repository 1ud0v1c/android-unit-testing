package com.ludovic.vimont.data.mappers

import com.ludovic.vimont.data.entities.Movie
import com.ludovic.vimont.domain.model.Movie as MovieModel

internal fun List<Movie>.toModel() = map {
    it.toModel()
}

internal fun Movie.toModel() = MovieModel(
    id = id,
    name = name,
    title = title,
    movieBanner = movieBanner,
    director = director,
    producer = producer,
    releaseDate = requireNotNull(releaseDate.toIntOrNull()) {
        "The release date is supposed to be convert to an Integer"
    },
)