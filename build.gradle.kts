// Top-level build file where you can add configuration options common to all sub-projects/modules.

// To convert build scripts from Groovy to Kotlin:

// All strings in settings.gradle.kts, project-level build.gradle and module-level build.gradle files
// must have double quotes.

// All property assignments must look like "versionCode = 1"

// All function invocations must look like "implementation("androidx.appcompat:appcompat:1.0.2")"

// Use plugins block (in app-level build.gradle) instead of separate "apply plugin" statements

// Build script file extensions must be .gradle.kts

// Tasks block must be changed

// Module level build script must be changed (see app-level build.gradle.kts for details)

buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.0-alpha05")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.41")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

// Tasks must look like this
tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}