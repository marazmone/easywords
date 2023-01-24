import com.marazmone.easyword.configureKotlinMultiplatform
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class KotlinMultiplatformConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.multiplatform")
                apply("org.jetbrains.kotlin.native.cocoapods")
            }

            extensions.findByType(KotlinMultiplatformExtension::class.java)?.apply {
                configureKotlinMultiplatform(this)
            }
        }
    }
}