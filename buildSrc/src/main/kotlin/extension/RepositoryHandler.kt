package extension

import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.applyDefaults() {
    google()
    jcenter()
}
