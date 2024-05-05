plugins {
    alias(libs.plugins.runinfy.android.library)
    alias(libs.plugins.runinfy.jvm.ktor)
}

android {
    namespace = "com.ak18.auth.data"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}