package com.rahmadev.delibrary.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
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

@Composable
fun BottomBar(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val navBackStack by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route

    NavigationBar(modifier = modifier) {
        NavigationBarItem(
            selected = currentRoute == "Home",
            onClick = {
                navHostController.navigate("Home") {
                    popUpTo(navHostController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    restoreState = true
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "Home Icon")
            },
            label = {
                Text(text = "Home")
            }
        )
        NavigationBarItem(
            selected = currentRoute == "Catalog",
            onClick = {
                navHostController.navigate("Catalog") {
                    popUpTo(navHostController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    restoreState = true
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.LibraryBooks,
                    contentDescription = "Catalog Icon"
                )
            },
            label = {
                Text(text = "Catalog")
            }
        )
        NavigationBarItem(
            selected = currentRoute == "Profile",
            onClick = {
                navHostController.navigate("Profile") {
                    popUpTo(navHostController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    restoreState = true
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Person Icon")
            },
            label = {
                Text(text = "Profile")
            }
        )
    }
}