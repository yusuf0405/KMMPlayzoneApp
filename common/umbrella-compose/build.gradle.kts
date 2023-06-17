plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

android {
    namespace = "com.joseph.kmmplayzoneapp.common.umbrella_compose"
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))
                implementation(project(":common:games:data"))
                implementation(project(":common:auth:data"))
                implementation(project(":common:tournaments:data"))
            }
        }
    }
}
