package com.rahmadev.delibrary.ui.screen.catalog.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.data.FacultiesData
import com.rahmadev.delibrary.model.Book
import java.util.Locale

@Composable
fun FolderItemNewBook(
    modifier: Modifier = Modifier,
    newBook: Book = FacultiesData.books[0],
    onItemClick: (Int) -> Unit
) {
    Column(
        modifier = Modifier.clickable {
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