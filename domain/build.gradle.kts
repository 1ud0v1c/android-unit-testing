@Suppress(
    "DSL_SCOPE_VIOLATION",
)
plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.test.coroutines)
    testImplementation(libs.mockk)
}