
import com.example.aesthetic.AestheticBuildType


plugins {
    alias(libs.plugins.aesthetic.android.application)
    alias(libs.plugins.aesthetic.android.application.compose)
    alias(libs.plugins.aesthetic.android.application.flavors)
    alias(libs.plugins.aesthetic.android.application.jacoco)
    alias(libs.plugins.aesthetic.android.hilt)
    id("jacoco")
    alias(libs.plugins.aesthetic.android.application.firebase)
    alias(libs.plugins.baselineprofile)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.example.aesthetic"

    defaultConfig {
        applicationId = "com.example.aesthetic"
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = AestheticBuildType.DEBUG.applicationIdSuffix
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(projects.feature.museum)
    implementation(projects.feature.profile)

    implementation(projects.core.designsystem)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.tracing.ktx)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.profileinstaller)
    implementation(libs.kotlinx.coroutines.guava)
    implementation(libs.coil.kt)
}