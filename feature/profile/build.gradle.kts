plugins {
    alias(libs.plugins.aesthetic.android.feature)
    alias(libs.plugins.aesthetic.android.library.compose)
    alias(libs.plugins.aesthetic.android.library.jacoco)
}

android {
    namespace = "com.example.aesthetic.feature.profile"
}

dependencies {
    implementation(projects.core.model)
}