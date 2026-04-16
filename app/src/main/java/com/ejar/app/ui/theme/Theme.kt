package com.ejar.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun EjarTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = darkColorScheme(
        primary = LuxuryGold,
        onPrimary = NavyBackground,
        primaryContainer = LuxuryGold.copy(alpha = 0.7f),
        secondary = LuxuryGold,
        onSecondary = NavyBackground,
        background = NavyBackground,
        surface = NavyBackground,
        surfaceVariant = White10,
        onSurface = Color.White,
        onBackground = Color.White,
        error = ErrorRed,
        onError = Color.White
    )

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as androidx.activity.ComponentActivity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
            window.statusBarColor = NavyBackground.toArgb()
            window.navigationBarColor = NavyBackground.toArgb()
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}
