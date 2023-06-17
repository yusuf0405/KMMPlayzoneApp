plugins {
    id("multiplatform-setup")
    id("android-setup")
}

android {
    namespace = "com.joseph.kmmplayzoneapp.common.games.api"
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
//                implementation(project(":common:core"))
            }
        }
    }
}