package com.rahmadev.delibrary.ui.utils

import com.rahmadev.delibrary.ui.navigation.Screen

fun String?.shouldShowBottomBar(): Boolean {
    return this in setOf(
        Screen.Home.route,
        Screen.Catalog.route,
        Screen.Profile.route,
        Screen.ForgetPassword.route,
        Screen.Login.route,
        Screen.Register.route,
        Screen.SuccessRegister.route
    )
}