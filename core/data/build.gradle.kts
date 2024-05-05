plugins {
    alias(libs.plugins.runinfy.android.library)
    alias(libs.plugins.runinfy.jvm.ktor)
}

android {
    namespace = "com.ak18.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}