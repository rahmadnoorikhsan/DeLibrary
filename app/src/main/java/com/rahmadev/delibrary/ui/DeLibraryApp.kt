package com.rahmadev.delibrary.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rahmadev.delibrary.ui.component.BottomBar
import com.rahmadev.delibrary.ui.navigation.Screen
import com.rahmadev.delibrary.ui.screen.catalog.CatalogScreen
import com.rahmadev.delibrary.ui.screen.catalog.DetailCatalog
import com.rahmadev.delibrary.ui.screen.catalog.ListNewBook
import com.rahmadev.delibrary.ui.screen.home.HomeScreen
import com.rahmadev.delibrary.ui.screen.profile.ProfileScreen
import com.rahmadev.delibrary.ui.screen.searchhome.SearchHomeScreen
import com.rahmadev.delibrary.ui.utils.shouldShowBottomBar

@Composable
fun DeLibraryApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController(),
) {
    val navBackStack by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route

    Scaffold(
        bottomBar = {
            AnimatedVisibility(
                visible = currentRoute.shouldShowBottomBar(),
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { it }),
            ) {
                BottomBar(navHostController)
            }
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
                ProfileScreen(navController = navHostController)
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
            composable(Screen.SearchHome.route) {
                SearchHomeScreen(navController = navHostController)
            }
            composable(Screen.ListBook.route) {
                ListNewBook(navController = navHostController)
            }
            composable(Screen.Login.route) {
                ListNewBook(navController = navHostController)
            }
        }
    }
}