package com.rahmadev.delibrary.ui.screen.catalog.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rahmadev.delibrary.data.FacultiesData
import com.rahmadev.delibrary.model.Book

@Composable
fun FolderItemNewBook(
    modifier: Modifier = Modifier,
    newBook: Book = FacultiesData.books[0],
    onItemClick: (Int) -> Unit,
) {
    Column(
        modifier = modifier.clickable {
            onItemClick(newBook.id)
        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = newBook.image),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
                .height(150.dp),
            contentDescription = "Icon New Book"
        )
    }
}