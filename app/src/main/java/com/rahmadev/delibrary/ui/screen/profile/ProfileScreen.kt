package com.rahmadev.delibrary.ui.screen.profile


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rahmadev.delibrary.ui.login.LoginScreen

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    ProfileContent(modifier)
}

@Composable
fun ProfileContent(
    modifier: Modifier = Modifier
) {
    LoginScreen()
}
