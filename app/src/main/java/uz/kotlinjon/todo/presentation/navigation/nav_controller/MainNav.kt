package uz.kotlinjon.todo.presentation.navigation.nav_controller

import Home
import Main
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import uz.kotlinjon.todo.presentation.screens.addTask.addTask
import uz.kotlinjon.todo.presentation.screens.home.home
import uz.kotlinjon.todo.presentation.screens.profile.profile
import uz.kotlinjon.todo.presentation.screens.todo.todo

fun NavGraphBuilder.mainNav(
    navHostController: NavHostController
) {
    navigation<Main>(
        startDestination = Home
    ) {
        home(navHostController)
        todo(navHostController)
        addTask(navHostController)
        profile(navHostController)

    }
}