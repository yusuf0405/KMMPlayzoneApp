plugins {
    id("multiplatform-setup")
    id("android-setup")
}

android {
    namespace = "com.joseph.kmmplayzoneapp.common.tournaments.data"
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":common:core"))
                implementation(project(":common:tournaments:api"))
            }
        }
    }
}