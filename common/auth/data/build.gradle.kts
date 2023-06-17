plugins {
    id("multiplatform-setup")
    id("android-setup")
}

android {
    namespace = "com.joseph.kmmplayzoneapp.common.auth.data"
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":common:core"))
                implementation(project(":common:auth:api"))
            }
        }
    }
}