
plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

repositories {
    mavenCentral()
//    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.12")
}

    publishing {
        publications {
            register<MavenPublication>("java") {
                groupId = "com.github.villoal"
                artifactId = "KalendarLocale"
                version = "0.1.5"

                afterEvaluate {
                    from(components["java"])
                }
            }
        }
    }
