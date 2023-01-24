plugins {
    `kotlin-dsl`
}

group = "com.marazmone.easywords.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "compositebuild.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidKotlin") {
            id = "compositebuild.jetbrains.kotlin.android"
            implementationClass = "AndroidKotlinConventionPlugin"
        }
        register("androidLibrary") {
            id = "compositebuild.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidCompose") {
            id = "compositebuild.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
        register("kmm") {
            id = "compositebuild.jetbrains.kotlin.multiplatform"
            implementationClass = "KotlinMultiplatformConventionPlugin"
        }
    }
}