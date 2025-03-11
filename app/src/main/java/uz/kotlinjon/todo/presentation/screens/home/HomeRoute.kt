package uz.kotlinjon.todo.presentation.screens.home

import Home
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.home(navHostController: NavHostController) {
    composable<Home> {
        HomeScreen()

    }
}