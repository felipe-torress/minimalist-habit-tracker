plugins {
    alias(libs.plugins.habittracker.android.library)
    alias(libs.plugins.habittracker.android.library.jacoco)
    alias(libs.plugins.habittracker.android.hilt)
    id("kotlinx-serialization")
}

android {
    namespace = "com.example.habittracker.core.data"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
//    api(projects.core.common)
//    api(projects.core.database)
//    api(projects.core.datastore)
//    api(projects.core.network)

    implementation(projects.core.model)

    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.kotlinx.serialization.json)
}