plugins {
    alias(app.plugins.android.application)
    alias(app.plugins.android.kotlin)
    alias(app.plugins.android.ksp)
}
android {
    compileSdk = 34
    namespace = "com.yk.dexdeapplication"
    defaultConfig {
        applicationId = "com.yk.dexdeapplication"
        minSdk = 21
        targetSdk = 28
        versionCode =1
        versionName ="1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            // 添加ProGuard配置，优化发行版性能
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            isShrinkResources =false
            // 添加ProGuard配置，优化发行版性能
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                   "proguard-rules.pro"
            )

        }
    }
}

dependencies {
    implementation(fileTree("dir" to "libs", "include" to "*.jar"))
    implementation(app.androidx.activity)
    implementation(app.androidx.appcompat)
    implementation(app.androidx.material)
    implementation(app.androidx.constraintlayout)
    implementation(project(":proxy_core"))
}
