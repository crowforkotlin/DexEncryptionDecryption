plugins {
    alias(app.plugins.android.library)
    alias(app.plugins.android.kotlin)
}
android {

    namespace ="com.yk.dexdeapplication"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
        targetSdk = 28
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
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
}
