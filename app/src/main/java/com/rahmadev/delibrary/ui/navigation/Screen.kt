package com.rahmadev.delibrary.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Catalog : Screen("catalog")
    data object Profile : Screen("profile")
    data object DetailCatalog : Screen("detail_catalog")
    data object SearchHome : Screen("search_home")
    data object ListBook : Screen("list_book")
    data object Login : Screen("login")
}