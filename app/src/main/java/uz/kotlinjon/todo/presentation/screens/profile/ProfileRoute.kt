package uz.kotlinjon.todo.presentation.screens.profile

import Profile
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


fun NavGraphBuilder.profile(navHostController: NavHostController) {
    composable<Profile> {
        val vm = viewModel<ProfileViewModel>()
        val state by vm.state.collectAsState()

        ProfileScreen(
            state = state,
            onEvent = {
                when(it){
                    is ProfileEvent.OnBackPressed -> {
                        navHostController.popBackStack()
                    }

                    else -> {vm.onEvent(it)}
                }
            }
        )

    }
}