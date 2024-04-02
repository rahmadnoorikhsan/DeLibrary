package com.rahmadev.delibrary.ui.screen.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
    Box(modifier = modifier.fillMaxSize()) {
        Text("Profile")
    }
}
