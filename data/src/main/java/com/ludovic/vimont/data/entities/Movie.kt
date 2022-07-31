package com.ludovic.vimont.data.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: String,
    val name: String,
    val title: String,
    @SerialName("movie_banner")
    val movieBanner: String,
    val director: String,
    val producer: String,
    @SerialName("release_date")
    val releaseDate: String,
)