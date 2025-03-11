package uz.kotlinjon.todo.presentation.util.extensions

import AddTask
import Home
import Profile
import Todo
import android.util.Log
import androidx.navigation.NavController

fun NavController.navigateSingleTop(
    screen: Any,
    singleTop: Boolean = true,
    saveState: Boolean = true,
    inclusive: Boolean = false
) {
    try {
        when (screen) {
            Home, AddTask, Profile, Todo -> {
                this.navigate(screen) {
                    this@navigateSingleTop.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) {
                            this.inclusive = inclusive
                            this.saveState = saveState
                        }
                        launchSingleTop = singleTop
                        restoreState = true
                    }
                }
            }

            else -> {
                this.navigate(screen) {
                    launchSingleTop = singleTop
                }
            }
        }
    } catch (e: Exception) {
        Log.d("Tag", "navigation error :${e.message}")
    }
}

fun Any.getClassName(): String? {
    return (this::class).qualifiedName
}
