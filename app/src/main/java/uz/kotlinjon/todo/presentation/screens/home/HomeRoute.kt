package uz.kotlinjon.todo.presentation.screens.home

import Home
import android.app.Activity
import androidx.activity.compose.LocalActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.home(navHostController: NavHostController) {
    composable<Home> {
        val vm = viewModel<HomeViewModel>()
        val state by vm.state.collectAsState()

        val activity = LocalActivity.current as Activity

        HomeScreen(
            state = state,
            onEvent = {
                when (it) {
                    HomeEvent.OnBackPressed -> {
                     activity.finishAffinity()
                    }

                    else -> vm.onEvent(it)
                }
            }
        )
    }
}