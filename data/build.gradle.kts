@Suppress(
    "DSL_SCOPE_VIOLATION",
)
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.ludovic.vimont.androidunittesting"
        minSdk = 24
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":domain"))

    // Json Handling
    implementation(libs.kotlinx.serialization)

    // Retrofit for API call
    implementation(libs.retrofit2)
    implementation(libs.retrofit2.kotlinx.serialization)

    testImplementation(libs.junit)
}