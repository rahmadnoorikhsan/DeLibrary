package com.rahmadev.delibrary.ui.screen.catalog.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.rahmadev.delibrary.data.FacultiesData
import com.rahmadev.delibrary.ui.navigation.Screen

@Composable
fun ListBook(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val newBook = FacultiesData.books

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
            .fillMaxSize()
    ) {
        items(newBook, { it.id }) {
            FolderItemNewBook(newBook = it) { bookId ->
                navController.navigate(Screen.DetailCatalog.route + "/$bookId")
            }
        }
    }
}