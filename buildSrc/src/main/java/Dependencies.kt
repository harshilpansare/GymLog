object Modules {
    const val CORE = ":core"
}

object Version {
    const val MIN_SDK_VERSION = 24
    const val COMPILE_SDK_VERSION = 34
    const val TARGET_SDK_VERSION = 34

    const val APP_VERSION = 1
    const val APP_VERSION_NAME = "1.0"

    const val KOTLIN = "1.9.0"
    const val JVM = "1.8"
}

object AndroidX {
    const val CORE_KTX = "androidx.core:core-ktx:1.12.0"
    const val ACTIVITY_COMPAT = "androidx.activity:activity-ktx:1.8.2"
    const val FRAGMENT_COMPAT = "androidx.fragment:fragment-ktx:1.6.2"

    // navigation
    const val NAV_VERSION = "2.5.3"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${NAV_VERSION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${NAV_VERSION}"

    private const val LifecycleVersion = "2.6.1"

    const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LifecycleVersion"
    const val LIFECYCLE_COROUTINE = "androidx.lifecycle:lifecycle-runtime-ktx:$LifecycleVersion"
}

object Network {
    // Retrofit
    private const val ChuckVersion = "3.5.2"
    private const val RetrofitVersion = "2.9.0"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RetrofitVersion"
    const val RETROFIT_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.10.0"
    const val MOSHI_ADAPTER = "com.squareup.moshi:moshi-adapters:1.14.0"
    const val MOSHI_CONVERTOR = "com.squareup.retrofit2:converter-moshi:$RetrofitVersion"
    const val KOTSHI = "se.ansman.kotshi:api:2.9.1"
    const val KOTSHI_PROCESSOR = "se.ansman.kotshi:compiler:2.9.1"

    const val GSON = "com.google.code.gson:gson:2.10.1"
    const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:2.9.0"

    // http debugger
    const val CHUCKER_INTERCEPTOR = "com.github.chuckerteam.chucker:library:$ChuckVersion"
    const val CHUCKER_INTERCEPTOR_NO_IMPL =
        "com.github.chuckerteam.chucker:library-no-op:$ChuckVersion"
}

object UI {
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:1.8.2"
    const val COMPOSE_BOM = "androidx.compose:compose-bom:2023.08.00"
    const val COMPOSE_UI = "androidx.compose.ui:ui"
    const val COMPOSE_GRAPHICS = "androidx.compose.ui:ui-graphics"
    const val COMPOSE_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
    const val COMPOSE_MATERIAL3 = "androidx.compose.material3:material3"
    const val COMPOSE_DEBUG_TOOLING = "androidx.compose.ui:ui-tooling"
    const val COMPOSE_DEBUG_MANIFEST = "androidx.compose.ui:ui-test-manifest"
}

object DI {
    private const val hilt_version = "2.50"

    // Koin main features for Android (Scope,ViewModel ...)
    const val HILT = "com.google.dagger:hilt-android:$hilt_version"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:$hilt_version"
}

object Coroutine {
    private const val coroutine_version = "1.6.4"

    // Coroutines
    const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version"
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version"
}

object ThirdParty {
    // logging lib
    const val TIMBER = "com.jakewharton.timber:timber:5.0.1"

    // Glide
    private const val glideVersion = "4.15.1"
    const val GLIDE = "com.github.bumptech.glide:glide:$glideVersion"
    const val GLIDE_ANNOTATION_PROCESSOR = "com.github.bumptech.glide:compiler:$glideVersion"
}

object Testing {
    // Test helpers for LiveData
    const val CORE_TESTING = "androidx.arch.core:core-testing:2.2.0"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
    const val JUNIT = "junit:junit:4.13.2"
    const val KOTLIN_MOCKITO = "org.mockito.kotlin:mockito-kotlin:4.1.0"
}