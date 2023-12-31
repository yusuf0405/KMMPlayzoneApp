object Dependencies {

    object Kodein {
        const val core = "org.kodein.di:kodein-di:7.1.0"
    }

    object Kotlin {
        private const val kotlinVersion = "1.8.20"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

        object Serialization {
            const val gradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:1.5.31"
            const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.1"
        }

        object Coroutines {
            private const val version = "1.6.4"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }
    }

    object Compose {
        private const val composeVersion = "1.4.0"
        const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$composeVersion"
    }

    object Ktor {
        private const val version = "2.2.1"
        const val core = "io.ktor:ktor-client-core:$version"
        const val json = "io.ktor:ktor-client-json:$version"
        const val ios = "io.ktor:ktor-client-ios:$version"
        const val negotiation = "io.ktor:ktor-client-content-negotiation:$version"
        const val serialization = "io.ktor:ktor-serialization-kotlinx-json:$version"
        const val logging = "io.ktor:ktor-client-logging:$version"
        const val okhttp = "io.ktor:ktor-client-okhttp:$version"
        const val android = "io.ktor:ktor-client-android:$version"
    }

    object SqlDelight {
        private const val version = "1.5.3"
        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:$version"
        const val core = "com.squareup.sqldelight:runtime:$version"
        const val android = "com.squareup.sqldelight:android-driver:$version"
        const val ios = "com.squareup.sqldelight:native-driver:$version"
        const val dekstop = "com.squareup.sqldelight:sqlite-driver:$version"

    }

    object Android {
        private const val agpVersion = "8.0.1"
        const val gradlePlugin = "com.android.tools.build:gradle:$agpVersion"
    }
}