package com.rahmadev.delibrary.ui.screen.catalog

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.rahmadev.delibrary.data.FacultiesData
import com.rahmadev.delibrary.ui.component.Header

@Composable
fun DetailCatalog(
    modifier: Modifier = Modifier,
    navController: NavController,
    bookId: Int?,
) {
    val newBookList = FacultiesData.books.filter { book ->
        book.id == bookId
    }
    val context = LocalContext.current

    Column {
        Header(showSearch = false, title = "Katalog Perpustakaan IT Del")
        Surface(
            shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp),
            color = Color.White,
            modifier = modifier.fillMaxSize()
        ) {
            Column(modifier = Modifier) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    IconButton(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier
                            .align(Alignment.CenterStart),
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back Icon",
                            tint = Color.Black
                        )
                    }
                    Text(
                        text = "Detail Buku",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        color = Color.Blue,
                        modifier = Modifier.fillMaxWidth(0.6f)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Image(
                    painter = painterResource(id = newBookList[0].image),
                    contentDescription = null,
                    modifier = Modifier
                        .height(160.dp)
                        .width(120.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .align(Alignment.CenterHorizontally),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("ID Buku : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].id.toString())
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Judul Buku : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].title)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Bahasa : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].language)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Subjek : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].subject)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Pengarang : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].author)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Penerbit : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].publisher)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Deskripsi : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].description)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Lokasi Buku : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].bookLocation)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Status Buku : ")
                        }
                        withStyle(style = SpanStyle()) {
                            append(newBookList[0].bookStatus)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {
                        Toast.makeText(
                            context,
                            "Fitur Sedang dikembangkan",
                            Toast.LENGTH_SHORT
                        ).show() },
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(text = "Pinjam")
                }
            }
        }
    }
}