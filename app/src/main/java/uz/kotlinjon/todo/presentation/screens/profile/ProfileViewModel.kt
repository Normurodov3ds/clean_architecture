package uz.kotlinjon.todo.presentation.screens.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class ProfileViewModel : ViewModel() {


    private val _state = MutableStateFlow(ProfileState())
    val state =
        _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), ProfileState())

    fun onEvent(event: ProfileEvent) {
        when (event) {

            else -> Unit
        }
    }
}