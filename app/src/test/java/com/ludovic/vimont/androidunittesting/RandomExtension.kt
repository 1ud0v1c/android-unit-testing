package com.ludovic.vimont.androidunittesting

import com.ludovic.vimont.androidunittesting.user.User
import kotlin.random.Random

private const val STRING_LENGTH: Int = 20
private const val LETTER = "abcdefghijklmnopqrstuvwxyz"
private const val DIGIT = "0123456789"
private const val AT_CHARACTER = "@"

private val DOMAINS_LIST = arrayOf(
    "gmail.com",
    "yahoo.com",
    "msn.com",
    "orange.fr",
    "outlook.com",
    "sfr.fr"
)

enum class StringConstraints {
    LETTER,
    DIGIT,
    ALPHA_NUMERIC
}

fun Random.nextString(
    size: Int = STRING_LENGTH,
    constraints: StringConstraints = StringConstraints.ALPHA_NUMERIC
): String {
    val stringSize = if (size > 0) size else STRING_LENGTH
    val dataSet = when (constraints) {
        StringConstraints.LETTER -> LETTER
        StringConstraints.DIGIT -> DIGIT
        StringConstraints.ALPHA_NUMERIC -> LETTER + DIGIT
    }
    return (1..stringSize)
        .map { Random.nextInt(0, dataSet.length) }
        .map(dataSet::get)
        .joinToString("")
}

fun Random.nextEmail(): String {
    return Random.nextString(12) + AT_CHARACTER + DOMAINS_LIST.random()
}

fun Random.nextUser(
    firstName: String = nextString(),
    lastName: String = nextString(),
    email: String = nextEmail()
): User {
    return User(firstName, lastName, email)
}