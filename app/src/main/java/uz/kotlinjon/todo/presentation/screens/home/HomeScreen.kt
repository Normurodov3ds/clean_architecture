package uz.kotlinjon.todo.presentation.screens.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import uz.kotlinjon.todo.domain.language.stringResource


@Composable
fun HomeScreen() {
    Text(
        text = stringResource.strHome
    )
}