package uz.kotlinjon.todo.presentation.screens.addTask

import AddTask
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.addTask(navController: NavHostController) {
    composable<AddTask> {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Add task",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}