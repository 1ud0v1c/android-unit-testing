package com.ludovic.vimont.androidunittesting.config

import org.junit.Test

class RemoteConfigTest {
    @Test
    fun `nestedClass reflection should display all remote config`() {
        val remoteConfigs = RemoteConfig::class.sealedSubclasses
        remoteConfigs.forEach {
            println("remoteConfig: ${it.qualifiedName}")
        }
    }
}