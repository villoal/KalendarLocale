plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

repositories {
    mavenCentral()
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.12")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.villoal"
            artifactId = "KalendarLocale"
            version = "0.1.1"

            from(components["java"])
        }
    }
}
