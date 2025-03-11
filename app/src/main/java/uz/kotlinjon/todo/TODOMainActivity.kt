package uz.kotlinjon.todo

import Main
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import uz.kotlinjon.todo.presentation.navigation.nav_controller.root.RouteNav
import uz.kotlinjon.todo.presentation.navigation.nav_controller.root.RouteState
import uz.kotlinjon.todo.presentation.navigation.nav_controller.root.RouteViewModel
import uz.kotlinjon.todo.presentation.ui.theme.TODOTheme

class TODOMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            val vm = RouteViewModel()
            val routeState = RouteState()

            TODOTheme {

                RouteNav(
                    startDestination = Main,
                    navController = navController,
                    modifier = Modifier,
                    routeState = routeState,
                    onRouteEvent = {}
                )
            }
        }
    }
}
