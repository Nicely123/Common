pluginManagement {
    repositories {
        google()
        maven ( url = "https://jitpack.io" )
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

rootProject.name = "common"
include(":app")
include(":module_common")
