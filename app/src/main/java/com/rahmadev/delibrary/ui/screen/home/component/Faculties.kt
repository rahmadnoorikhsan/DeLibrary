package com.rahmadev.delibrary.ui.screen.home.component

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rahmadev.delibrary.data.FacultiesData

@Composable
fun Faculties(
    modifier: Modifier = Modifier,
) {
    val faculties = FacultiesData.faculties

    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = modifier) {
        items(faculties, { it.id }) {
            FolderItem(it.faculty)
        }
    }
}