// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        // other repositories...
        mavenCentral()
    }
    dependencies {
        // other plugins...
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48")
    }
}
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("androidx.navigation.safeargs") version "2.7.7" apply false
    id("org.jetbrains.kotlin.android") version "1.5.21" apply false
}
