@Suppress(
    "DSL_SCOPE_VIOLATION",
)
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

apply<RemoteConfigPlugin>()

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
    implementation(libs.android.core.ktx)
    implementation(libs.android.appcompat)
    implementation(libs.android.material)
    implementation(libs.android.constraintlayout)

    testImplementation(libs.junit)
    testImplementation(libs.kotlin.reflect)

    androidTestImplementation(libs.android.test.junit)
    androidTestImplementation(libs.android.test.espresso)
}