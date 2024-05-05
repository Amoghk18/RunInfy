plugins {
    alias(libs.plugins.runinfy.android.library)
}

android {
    namespace = "com.ak18.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}