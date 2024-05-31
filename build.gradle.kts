plugins {
    kotlin("jvm") version "1.9.24"
    application
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation("com.azure:azure-data-tables:12.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:1.8.1")
}

application {
    mainClass.set("test.MainKt")
}
