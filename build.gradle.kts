// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // TODO 2: Register the Safe Args plugin at the project level with "apply false".
//         "apply false" means the plugin is available to all modules but not yet activated.
//         It will be activated in app/build.gradle.kts.
}
