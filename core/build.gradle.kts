plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    kotlin("kapt")
}

android {
    namespace = "com.growth.core"
    compileSdk = Version.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = Version.MIN_SDK_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Version.JVM
    }
}

dependencies {
    // AndroidX
    api(AndroidX.CORE_KTX)
    api(AndroidX.ACTIVITY_COMPAT)
    api(AndroidX.FRAGMENT_COMPAT)
    // Navigation
    api(AndroidX.NAVIGATION_UI)
    api(AndroidX.NAVIGATION_FRAGMENT)
    // Lifecycle
    api(AndroidX.LIFECYCLE_COROUTINE)
    api(AndroidX.VIEW_MODEL)

    // Hilt
    api(DI.HILT)
    kapt(DI.HILT_COMPILER)

    // Network
    // Retrofit
    api(Network.RETROFIT)
    api(Network.RETROFIT_LOGGING_INTERCEPTOR)
    // Chucker
    debugApi(Network.CHUCKER_INTERCEPTOR)
    releaseApi(Network.CHUCKER_INTERCEPTOR_NO_IMPL)
    // Gson TODO replace with moshi
    api(Network.GSON)
    api(Network.GSON_CONVERTER)

    // Compose
    api(UI.COMPOSE_ACTIVITY)
    api(platform(UI.COMPOSE_BOM))
    api(UI.COMPOSE_UI)
    api(UI.COMPOSE_GRAPHICS)
    api(UI.COMPOSE_PREVIEW)
    api(UI.COMPOSE_MATERIAL3)
    debugApi(UI.COMPOSE_DEBUG_TOOLING)
    debugApi(UI.COMPOSE_DEBUG_MANIFEST)

    // Coroutines
    api(Coroutine.CORE)
    api(Coroutine.ANDROID)

    // Testing JUnit Mockito
    testApi(Testing.CORE_TESTING)
    testApi(Testing.COROUTINES_TEST)
    testApi(Testing.JUNIT)
    testApi(Testing.KOTLIN_MOCKITO)

    // ThirdParty
    api(ThirdParty.TIMBER)
    // Glide
    api(ThirdParty.GLIDE)
    kapt(ThirdParty.GLIDE_ANNOTATION_PROCESSOR)
}