plugins {
    alias(libs.plugins.runinfy.android.feature.ui)
}

android {
    namespace = "com.ak18.auth.presentation"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
}