pluginManagement {
    repositories {
        maven("https://mirrors.cloud.tencent.com/gradle-plugin-portal/")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/central")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    @Suppress("UnstableApiUsage") // TODO: Keep an eye on this
    repositories {
        google()
        mavenCentral()
    }
}
include(":app")
