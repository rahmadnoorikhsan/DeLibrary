package com.rahmadev.delibrary.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Catalog : Screen("catalog")
    data object Profile : Screen("profile")
    data object DetailCatalog : Screen("detail_catalog")
    data object SearchHome : Screen("search_home")
    data object ListBook : Screen("list_book")
    data object Login : Screen("login")
    data object ForgetPassword : Screen("forget")
    data object Register : Screen("register")
    data object SuccessRegister : Screen("success_register")
    data object SplashScreen : Screen("splash_screen")
    data object RiwayatPeminjaman : Screen("riwayat_screen")
}