import android.graphics.drawable.Icon
import kotlinx.serialization.Serializable
import uz.kotlinjon.todo.R


// nav controller
@Serializable
data object Main
@Serializable
data object Auth


// screens
@Serializable
data object AuthMain


// Bottom navigation

@Serializable
sealed class BottomNAvRoutes(
    val icon: Int, val name: String
)
@Serializable
data object Home : BottomNAvRoutes(R.drawable.ic_home_unsellected, "HOME")
@Serializable
data object Todo : BottomNAvRoutes(R.drawable.todo_unselected, "TODO")
@Serializable
data object AddTask : BottomNAvRoutes(R.drawable.add_task_unselected, "ADD TASK")
@Serializable
data object Profile : BottomNAvRoutes(R.drawable.profile_unselected, "PROFILE")



