plugins {
    alias(libs.plugins.runinfy.android.library)
}

android {
    namespace = "com.ak18.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}