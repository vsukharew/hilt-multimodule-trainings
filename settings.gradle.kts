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
include(":core")
include(":core:data")
include(":registration")
include(":core:di")
include(":core:ui")
