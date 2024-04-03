package com.rahmadev.delibrary.ui.screen.catalog

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.rahmadev.delibrary.ui.screen.catalog.component.ListBook

@Composable
fun ListNewBook(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    ListBook(navController = navController, modifier = modifier)
}