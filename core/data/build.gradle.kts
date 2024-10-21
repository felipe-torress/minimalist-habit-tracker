plugins {
    alias(libs.plugins.aesthetic.android.library)
    alias(libs.plugins.aesthetic.android.library.jacoco)
    alias(libs.plugins.aesthetic.android.hilt)
    id("kotlinx-serialization")
}

android {
    namespace = "com.example.aesthetic.core.data"

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