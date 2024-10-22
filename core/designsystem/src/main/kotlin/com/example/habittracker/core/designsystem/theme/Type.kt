package com.example.habittracker.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.habittracker.core.designsystem.R

//region --- Font Families ---
val firaFamily = FontFamily(
    Font(resId = R.font.fira_mono_bold, weight = FontWeight.Bold),
    Font(resId = R.font.fira_mono_medium, weight = FontWeight.Medium),
    Font(resId = R.font.fira_mono_regular, weight = FontWeight.Normal),
)

val satoshiFamily = FontFamily(
    Font(resId = R.font.satoshi_black, weight = FontWeight.Black),
    Font(resId = R.font.satoshi_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
    Font(resId = R.font.satoshi_bold, weight = FontWeight.Bold),
    Font(resId = R.font.satoshi_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(resId = R.font.satoshi_medium, weight = FontWeight.Medium),
    Font(resId = R.font.satoshi_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(resId = R.font.satoshi_regular, weight = FontWeight.Normal),
    Font(resId = R.font.satoshi_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(resId = R.font.satoshi_light, weight = FontWeight.Light),
    Font(resId = R.font.satoshi_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
)
//endregion

// Set of Material typography styles to start with
val typography = Typography(
    // Example of custom text style using the Satoshi font family
    displayLarge = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Black,
        fontSize = 57.sp
    ),
    displayMedium = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp
    ),
    displaySmall = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelLarge = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp
    )
)

object HabitTrackerTypography {
    // Satoshi
    val headline4 = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Black,
        fontSize = 32.sp
    )

    val subtitle1 = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )

    val bodyLarge = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    )

    val bodySmall = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )

    val caption = TextStyle(
        fontFamily = satoshiFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    )

    // Fira Mono
    val bodySmallFira = TextStyle(
        fontFamily = firaFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )
}