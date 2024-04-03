package com.rahmadev.delibrary.ui.screen.catalog.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.data.FacultiesData
import com.rahmadev.delibrary.ui.navigation.Screen

@Composable
fun FavoriteBoook(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val favoriteBook = FacultiesData.favoritebook

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(favoriteBook, { it.idBookFav }) {
            FolderBookFavorite(newFavoriteBook = it) { favoriteBook ->
                navController.navigate(Screen.DetailCatalog.route + "/$favoriteBook")
            }
        }
    }
}