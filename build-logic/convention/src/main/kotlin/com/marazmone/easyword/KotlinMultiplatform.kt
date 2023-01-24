package com.marazmone.easyword

import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun Project.configureKotlinMultiplatform(
    extension: KotlinMultiplatformExtension,
) {
    extension.apply {
        android()
        iosX64()
        iosArm64()
        iosSimulatorArm64()
    }
}