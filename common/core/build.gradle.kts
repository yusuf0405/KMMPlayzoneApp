plugins {
    id("multiplatform-setup")
    id("android-setup")
    kotlin("plugin.serialization")
}

android {
    namespace = "com.joseph.kmmplayzoneapp.common"
}
kotlin {
    sourceSets {
        commonMain {
            dependencies {

                api(Dependencies.Ktor.core)
                api(Dependencies.Kodein.core)
                api(Dependencies.Kotlin.Coroutines.core)
                api(Dependencies.Kotlin.Serialization.serialization)
                api(Dependencies.SqlDelight.core)

                implementation(Dependencies.Ktor.serialization)
                implementation(Dependencies.Ktor.json)
                implementation(Dependencies.Ktor.logging)
                implementation(Dependencies.Ktor.negotiation)

            }
        }
        androidMain {
            dependencies {
                implementation(Dependencies.Ktor.android)
                implementation(Dependencies.SqlDelight.android)

            }
        }
        iosMain {
            dependencies {
                implementation(Dependencies.Ktor.ios)
                implementation(Dependencies.SqlDelight.ios)
            }
        }

        dekstopMain {
            dependencies {
                implementation(Dependencies.Ktor.okhttp)
                implementation(Dependencies.SqlDelight.dekstop)
            }
        }
    }
}