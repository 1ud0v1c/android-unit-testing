package com.ludovic.vimont.domain.model

data class Movie(
    val id: String,
    val name: String,
    val title: String,
    val movieBanner: String,
    val director: String,
    val producer: String,
    val releaseDate: Int,
)