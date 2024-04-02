package com.rahmadev.delibrary.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Catalog : Screen("catalog")
    data object Profile : Screen("profile")
}