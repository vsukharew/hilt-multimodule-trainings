pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "hilt-multimodule-trainings"
include(":app")
include(":order-impl")
include(":core-impl")
include(":core-impl:data")
include(":registration")
include(":core-impl:di")
include(":core-impl:ui")
include(":core-api:data")
include(":calendar-impl")
include(":flownavigation-impl")
include(":navigation-api")
include(":navigation-impl")
include(":calendar-api")
include(":main-menu")
include(":order-api")
