package com.ludovic.vimont.androidunittesting.user

class EmailValidator {
    private companion object {
        private val REGEX_EMAIL = "[A-Za-z0-9-_.]+@[a-zA-z0-9]+.[a-zA-Z]{2,3}".toRegex()
    }

    fun isEmailValid(email: String): Boolean {
        return email.isNotEmpty() && REGEX_EMAIL.matches(email)
    }
}