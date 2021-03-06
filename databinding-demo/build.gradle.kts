plugins {
    id("com.android.application") version "7.0.4" apply false
    id("com.android.library") version "7.0.4" apply false
    id("org.jetbrains.kotlin.android") version "1.6.20" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.20" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}