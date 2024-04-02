package com.rahmadev.delibrary.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rahmadev.delibrary.ui.navigation.BottomBar
import com.rahmadev.delibrary.ui.screen.catalog.CatalogScreen
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
            startDestination = "Home",
            modifier = modifier.padding(it)
        ) {
            composable("Home") {
                HomeScreen()
            }
            composable("Catalog") {
                CatalogScreen()
            }
            composable("Profile") {
                ProfileScreen()
            }
        }
    }
}