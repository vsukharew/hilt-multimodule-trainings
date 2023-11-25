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
include(":order")
include(":core-impl")
include(":core-impl:data")
include(":registration")
include(":core-di")
include(":core-impl:ui")
include(":core-api:data")
include(":calendar")
include(":flownavigation-impl")
include(":navigation-api")
include(":navigation-impl")
include(":main-menu")
