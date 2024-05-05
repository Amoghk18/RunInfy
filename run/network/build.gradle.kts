plugins {
    alias(libs.plugins.runinfy.android.library)
    alias(libs.plugins.runinfy.jvm.ktor)
}

android {
    namespace = "com.ak18.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}