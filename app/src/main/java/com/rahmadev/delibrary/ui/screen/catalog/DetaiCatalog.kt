package com.rahmadev.delibrary.ui.screen.catalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.rahmadev.delibrary.data.FacultiesData

@Composable
fun DetailCatalog(
    modifier: Modifier = Modifier,
    navController: NavController,
    bookId: Int?
) {
    val newBookList = FacultiesData.books.filter { book ->
        book.id == bookId
    }

    Column {
        Image(painter = painterResource(id = newBookList[0].image), contentDescription = null)
        Text(text = newBookList[0].title)
    }
}