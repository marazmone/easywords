@file:Suppress("UnstableApiUsage")

@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("compositebuild.android.application")
    id("compositebuild.jetbrains.kotlin.android")
    id("compositebuild.android.compose")
}

android {
    namespace = "com.marazmone.easywords.android"

    defaultConfig {
        applicationId = "com.marazmone.easywords.android"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.bundles.compose)
}