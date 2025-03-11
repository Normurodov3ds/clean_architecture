package uz.kotlinjon.todo.presentation.screens.profile

sealed interface ProfileEvent {
    data object OnBackPressed : ProfileEvent
}