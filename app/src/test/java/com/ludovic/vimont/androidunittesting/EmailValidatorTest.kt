package com.ludovic.vimont.androidunittesting

import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class EmailValidatorTest {
    private val emailValidator = EmailValidator()

    @Test
    fun `isEmailValid should return false, when empty`() {
        // Given
        val user = Random.nextUser(email = "")

        // When
        val result = emailValidator.isEmailValid(user.email)

        // Then
        Assert.assertFalse(result)
    }

    @Test
    fun `isEmailValid should return false, with an invalid pattern`() {
        // Given
        val user = Random.nextUser(email = Random.nextString())

        // When
        val result = emailValidator.isEmailValid(user.email)

        // Then
        Assert.assertFalse(result)
    }

    @Test
    fun `isEmailValid should return true, with a good input`() {
        // Given
        val user = Random.nextUser()
        println(user)

        // When
        val result = emailValidator.isEmailValid(user.email)

        // Then
        Assert.assertTrue(result)
    }
}