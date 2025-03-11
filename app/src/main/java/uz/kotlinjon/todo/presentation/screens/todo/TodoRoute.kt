package uz.kotlinjon.todo.presentation.screens.todo

import Todo
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.todo(navController: NavHostController) {

    composable<Todo> {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray.copy(.5f))
        ) {

            Text(
                text = "TODO",
                modifier = Modifier.align(Alignment.Center)
            )

        }
    }

}