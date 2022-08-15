package com.ludovic.vimont.androidunittesting.config

sealed class RemoteConfig(
    val id: String,
    val description: String? = null,
    val isEnabled: Boolean = true
)