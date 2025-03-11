package uz.kotlinjon.todo.presentation.screens.home

import Home
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.home(navHostController: NavHostController) {
    composable<Home> {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "Home", modifier = Modifier.align(Alignment.Center))
        }

    }
}