// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript{
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
        classpath ("com.google.gms:google-services:4.3.10")
    }
    repositories {
        google()
        mavenCentral()
    }
}


plugins {
    id("com.android.application") version "8.2.0-alpha03" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}