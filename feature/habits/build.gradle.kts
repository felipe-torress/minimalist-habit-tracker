plugins {
    alias(libs.plugins.habittracker.android.feature)
    alias(libs.plugins.habittracker.android.library.compose)
    alias(libs.plugins.habittracker.android.library.jacoco)
}

android {
    namespace = "com.example.habittracker.feature.habits"
}

dependencies {
    implementation(projects.core.model)
}