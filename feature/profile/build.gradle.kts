plugins {
    alias(libs.plugins.habittracker.android.feature)
    alias(libs.plugins.habittracker.android.library.compose)
    alias(libs.plugins.habittracker.android.library.jacoco)
}

android {
    namespace = "com.example.habittracker.feature.profile"
}

dependencies {
    implementation(projects.core.model)
}