package uz.kotlinjon.todo.presentation.navigation.bottom_nav

import AddTask
import Home
import Profile
import Todo
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import uz.kotlinjon.todo.presentation.ui.theme.CustomTheme
import uz.kotlinjon.todo.presentation.util.extensions.getClassName
import uz.kotlinjon.todo.presentation.util.extensions.navigateSingleTop

@Composable
fun BottomNavigation(
    navHostController: NavHostController,
    bottomBarState: MutableState<Boolean>,
    modifier: Modifier = Modifier
) {
    AnimatedVisibility(
        visible = bottomBarState.value,
        enter = slideInVertically(initialOffsetY = { it }),
        exit = slideOutVertically(targetOffsetY = { it }),
        modifier = modifier
            .shadow(
                elevation = 48.dp,
                spotColor = CustomTheme.colorScheme.mainBlack.copy(alpha = 0.5f),
                ambientColor = CustomTheme.colorScheme.mainBlack.copy(alpha = 0.5f),
            )
    ) {
        NavigationBar(
            containerColor = CustomTheme.colorScheme.mainWhite,
            contentColor = CustomTheme.colorScheme.mainWhite,
            modifier = Modifier
                .heightIn(max = 70.dp)
                .background(color = CustomTheme.colorScheme.mainBlack)
                .shadow(
                    elevation = 48.dp,
                    spotColor = CustomTheme.colorScheme.mainBlack.copy(alpha = 0.5f),
                    ambientColor = CustomTheme.colorScheme.mainBlack.copy(alpha = 0.5f),
                )
                .padding(top = 1.dp)

        ) {
            val navBackStackEntry by navHostController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            listOf(
                Home,
                Todo,
                AddTask,
                Profile
            ).forEach { item ->
                val isSelected = item.getClassName() == currentRoute
                NavigationBarItem(
                    selected = isSelected,
                    onClick = {
                        if (currentRoute != item.getClassName()) {
                            navHostController.navigateSingleTop(screen = item)
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(item.icon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(
                                    if (isSelected) {
                                        28.dp
                                    } else 24.dp
                                )
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = CustomTheme.colorScheme.mainLightPink2,
                        selectedTextColor = CustomTheme.colorScheme.mainLightPink2,
                        unselectedIconColor = CustomTheme.colorScheme.mainLightPink,
                        unselectedTextColor = CustomTheme.colorScheme.mainLightPink,
                        indicatorColor = Color.Transparent
                    )
                )
            }
        }
    }
}