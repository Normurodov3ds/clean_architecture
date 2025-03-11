package uz.kotlinjon.todo.domain.language

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import uz.kotlinjon.todo.presentation.ui.theme.Language


val stringResource: StringResources
    @Composable
    @ReadOnlyComposable
    get() {
        val context = LocalContext.current
        return staticCompositionLocalOf {
            getStringRes(Language.UZ, context)
        }.current
    }


fun getStringRes(language: Language, current: Context) =
    when (language) {
        Language.UZ -> UZStringResources
        Language.RU -> RUStringResources
        Language.EN -> ENStringResources
    }