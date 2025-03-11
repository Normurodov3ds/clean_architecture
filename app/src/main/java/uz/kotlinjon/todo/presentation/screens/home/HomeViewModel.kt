package uz.kotlinjon.todo.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state = _state.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000L), HomeState())

    fun onEvent(event: HomeEvent) {
        when (event) {
            else -> Unit
        }
    }


}