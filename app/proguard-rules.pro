# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.

# Keep Firebase classes
-keep class com.google.firebase.** { *; }
-keep class com.firebase.** { *; }

# Keep Hilt
-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }

# Keep data models (Parcelable)
-keep class com.ejar.app.data.model.** { *; }
-keepnames class com.ejar.app.data.model.**

# Keep Compose
-keep class androidx.compose.** { *; }

# Keep Google Maps
-keep class com.google.android.gms.maps.** { *; }

# Keep Facebook
-keep class com.facebook.** { *; }

# Keep Gemini AI
-keep class com.google.ai.client.generativeai.** { *; }
