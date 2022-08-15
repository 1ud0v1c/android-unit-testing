import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
     `kotlin-dsl`
}

 repositories {
     google()
     mavenCentral()
 }

 tasks.withType<KotlinCompile> {
     kotlinOptions {
         jvmTarget = "1.8"
     }
 }