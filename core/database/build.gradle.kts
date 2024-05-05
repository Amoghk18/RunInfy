plugins {
    alias(libs.plugins.runinfy.android.library)
    alias(libs.plugins.runinfy.android.room)
}

android {
    namespace = "com.ak18.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}