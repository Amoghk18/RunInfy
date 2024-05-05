plugins {
    alias(libs.plugins.runinfy.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}