package com.rahmadev.delibrary.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rahmadev.delibrary.ui.component.BottomBar
import com.rahmadev.delibrary.ui.navigation.Screen
import com.rahmadev.delibrary.ui.screen.catalog.CatalogScreen
import com.rahmadev.delibrary.ui.screen.catalog.DetailCatalog
import com.rahmadev.delibrary.ui.screen.home.HomeScreen
import com.rahmadev.delibrary.ui.screen.profile.ProfileScreen

@Composable
fun DeLibraryApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = {
            BottomBar(navHostController)
        }
    ) {
        NavHost(
            navController = navHostController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(it)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController = navHostController)
            }
            composable(Screen.Catalog.route) {
                CatalogScreen(navController = navHostController)
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
            composable(
                Screen.DetailCatalog.route + "/{bookId}",
                arguments = listOf(navArgument("bookId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailCatalog(
                    navController = navHostController,
                    bookId = navBackStackEntry.arguments?.getInt("bookId")
                )
            }
        }
    }
}