plugins {
    id("java")
    alias(libs.plugins.gitSemVer)
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

gitSemVer {
    // Your configuration
    assignGitSemanticVersion()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}


tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
