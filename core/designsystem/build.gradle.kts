plugins {
    alias(libs.plugins.habittracker.android.library)
    alias(libs.plugins.habittracker.android.library.compose)
    alias(libs.plugins.habittracker.android.library.jacoco)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.example.habittracker.core.designsystem"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)

    debugApi(libs.androidx.compose.ui.tooling)

    implementation(libs.coil.kt.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.accompanist.systemuicontroller)

    testImplementation(libs.androidx.compose.ui.test)
    testImplementation(libs.accompanist.testharness)
    testImplementation(libs.hilt.android.testing)
    testImplementation(libs.robolectric)
    testImplementation(libs.roborazzi)

    androidTestImplementation(libs.androidx.compose.ui.test)
}