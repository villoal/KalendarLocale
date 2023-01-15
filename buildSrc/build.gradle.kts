
plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

repositories {
    mavenCentral()
    if ("true" == System.env.JITPACK) {
        mavenLocal()
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.12")
}

project.afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "com.github.villoal"
                artifactId = "KalendarLocale"
                version = "0.1.3"

                from(components["java"])
            }
        }
    }

}
