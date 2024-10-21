import com.example.habittracker.HabitTrackerBuildType

plugins {
    alias(libs.plugins.habittracker.android.application)
    alias(libs.plugins.habittracker.android.application.compose)
    alias(libs.plugins.habittracker.android.application.flavors)
    alias(libs.plugins.habittracker.android.application.jacoco)
    alias(libs.plugins.habittracker.android.hilt)
    id("jacoco")
    alias(libs.plugins.habittracker.android.application.firebase)
    alias(libs.plugins.baselineprofile)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.example.habittracker"

    defaultConfig {
        applicationId = "com.example.habittracker"
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = HabitTrackerBuildType.DEBUG.applicationIdSuffix
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