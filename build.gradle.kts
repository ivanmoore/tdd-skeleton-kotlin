plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.20"
    `kotlin-dsl`
    jacoco
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("com.natpryce:hamkrest:1.8.0.1")
    testImplementation("org.mockito:mockito-all:1.8.4")
}
