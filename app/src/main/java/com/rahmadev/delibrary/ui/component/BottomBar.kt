package com.rahmadev.delibrary.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.rahmadev.delibrary.data.NavigationData

@Composable
fun BottomBar(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val navBackStack by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route
    val navigationItems = NavigationData.navigationItems

    NavigationBar(modifier = modifier) {
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navHostController.navigate(item.screen.route) {
                        popUpTo(navHostController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(imageVector = item.icon, contentDescription = "${item.title} Icon")
                },
                label = {
                    Text(text = item.title)
                }
            )
        }
    }
}