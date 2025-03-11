package uz.kotlinjon.todo.presentation.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

@Immutable
class CustomColorTheme(
    mainBlack: Color,
    mainBlack2: Color,

    mainPurple: Color,
    mainPurple2: Color,

    mainWhite: Color,
    mainWhite2: Color,

    mainLightPink: Color,
    mainLightPink2: Color,


) {
    val mainBlack by mutableStateOf(mainBlack, structuralEqualityPolicy())
    val mainBlack2 by mutableStateOf(mainBlack2, structuralEqualityPolicy())

    val mainPurple by mutableStateOf(mainPurple, structuralEqualityPolicy())
    val mainPurple2 by mutableStateOf(mainPurple2, structuralEqualityPolicy())

    val mainWhite by mutableStateOf(mainWhite, structuralEqualityPolicy())
    val mainWhite2 by mutableStateOf(mainWhite2, structuralEqualityPolicy())

    val mainLightPink by mutableStateOf(mainLightPink, structuralEqualityPolicy())
    val mainLightPink2 by mutableStateOf(mainLightPink2, structuralEqualityPolicy())
}


fun lightCustomColorScheme(
    mainBlack: Color = MainBlack,
    mainBlack2: Color = MainBlack2,
    mainPurple: Color = MainPurple,
    mainPurple2: Color = MainPurple2,
    mainWhite: Color = MainWhite,
    mainWhite2: Color = MainWhite2,
    mainLightPink: Color = MainLightPink,
    mainLightPink2: Color = MainLightPink2,

) =
    CustomColorTheme(
        mainBlack = mainBlack,
        mainBlack2 = mainBlack2,
        mainPurple = mainPurple,
        mainPurple2 = mainPurple2,
        mainWhite = mainWhite,
        mainWhite2 = mainWhite2,
        mainLightPink = mainLightPink,
        mainLightPink2 = mainLightPink2,
    )

val LocalCustomColorScheme = staticCompositionLocalOf { lightCustomColorScheme() }
