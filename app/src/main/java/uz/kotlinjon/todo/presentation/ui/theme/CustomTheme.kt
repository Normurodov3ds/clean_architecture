package uz.kotlinjon.todo.presentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object CustomTheme {
    val colorScheme: CustomColorTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalCustomColorScheme.current

}

@Composable
fun CustomTheme(
    colorScheme: CustomColorTheme,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalCustomColorScheme provides colorScheme
    ) {
        content()
    }
}