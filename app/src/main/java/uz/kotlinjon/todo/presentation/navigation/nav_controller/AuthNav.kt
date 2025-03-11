package uz.kotlinjon.todo.presentation.navigation.nav_controller

import Auth
import AuthMain
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation

@Composable
fun  NavGraphBuilder.Auth(
    navController: NavHostController
){
    navigation<Auth>(
        startDestination = AuthMain
    ){

    }

}