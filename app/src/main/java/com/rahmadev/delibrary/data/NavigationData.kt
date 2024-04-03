package com.rahmadev.delibrary.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import com.rahmadev.delibrary.ui.navigation.NavigationItem
import com.rahmadev.delibrary.ui.navigation.Screen

object NavigationData {
    val navigationItems = listOf(
        NavigationItem(
            title = "Home",
            icon = Icons.Default.Home,
            screen = Screen.Home
        ),
        NavigationItem(
            title = "Category",
            icon = Icons.Default.Book,
            screen = Screen.Catalog
        ),
        NavigationItem(
            title = "Profile",
            icon = Icons.Default.Person,
            screen = Screen.Profile
        ),
    )
}