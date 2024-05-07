package com.ak18.core.presentation.designsystem

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

val DarkColorScheme = darkColorScheme(
    primary = RuninfyGreen,
    background = RuninfyBlack,
    surface = RuninfyDarkGray,
    secondary = RuninfyWhite,
    tertiary = RuninfyWhite,
    primaryContainer = RuninfyGreen30,
    onPrimary = RuninfyBlack,
    onBackground = RuninfyWhite,
    onSurface = RuninfyWhite,
    onSurfaceVariant = RuninfyGray
)

@Composable
fun RunInfyTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}