package uz.kotlinjon.todo.presentation.screens.home

sealed interface HomeEvent {
    data object OnBackPressed : HomeEvent
}