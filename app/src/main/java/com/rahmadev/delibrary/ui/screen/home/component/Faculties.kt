package com.rahmadev.delibrary.ui.screen.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rahmadev.delibrary.data.FacultiesData

@Composable
fun Faculties(
    modifier: Modifier = Modifier,
) {
    val faculties = FacultiesData.faculties

    LazyVerticalGrid(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Fixed(2),
        modifier = modifier
    ) {
        items(faculties, { it.id }) {
            FolderItem(faculty = it.faculty)
        }
    }
}