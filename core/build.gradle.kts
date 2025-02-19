plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

dependencies {

    // Retrofit
    api(libs.retrofit.core)
    api(libs.retrofit.gson)

    // OkHttp
    api(libs.okhttp)
    api(libs.logging.interceptor)
}