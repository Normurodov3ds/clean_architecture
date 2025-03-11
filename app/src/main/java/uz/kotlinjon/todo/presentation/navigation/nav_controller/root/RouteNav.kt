package uz.kotlinjon.todo.presentation.navigation.nav_controller.root

import Main
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import uz.kotlinjon.todo.presentation.navigation.bottom_nav.BottomNavigation
import uz.kotlinjon.todo.presentation.navigation.nav_controller.mainNav

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RouteNav(
    navController: NavHostController,
    startDestination: Any = Main,
    modifier: Modifier,
    onRouteEvent: (RouteEvent) -> Unit,
    routeState: RouteState,
    onThemeChange: () -> Unit = {},
    onLanguageChange: () -> Unit = {}
) {
    Scaffold(
        bottomBar = {
            val bottomBarState = rememberSaveable { (mutableStateOf(true)) }
            BottomNavigation(navHostController = navController,
                bottomBarState = bottomBarState)
        },
        containerColor = Color.White,
        contentWindowInsets = WindowInsets(
            0.dp,
            0.dp,
            0.dp,
            0.dp,
        ),
        modifier = modifier
    ) {
        NavHost(
            navController = navController,
            startDestination = startDestination
        ) {
            mainNav(navController)

        }
    }

}