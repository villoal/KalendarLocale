buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")

    }
    dependencies {
        classpath(Deps.Gradle.androidGradlePlugin)
        classpath(Deps.Gradle.kotlinGradlePlugin)
        classpath(Deps.Gradle.vanniktechGradlePlugin)
        classpath(Deps.Gradle.detektGradlePlugin)
        classpath(Deps.Gradle.ktlintGradlePlugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

subprojects {
    apply(plugin = Plugins.ktlint)
    apply(plugin = Plugins.detekt)
    apply(plugin = Plugins.maven)


}
allprojects {
    version = "0.1.2"
    group = "com.github.villoal"
}