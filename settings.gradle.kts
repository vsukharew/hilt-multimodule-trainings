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
include(":core-ui")
include(":core-api:data")
include(":calendar")
include(":navigation-api")
include(":main-menu")
