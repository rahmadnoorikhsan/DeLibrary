package com.rahmadev.delibrary.ui.screen.catalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.screen.catalog.component.NewBook
import com.rahmadev.delibrary.ui.screen.catalog.component.SearchView
import com.rahmadev.delibrary.ui.screen.home.component.Faculties

@Composable
fun CatalogScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    CatalogContent(
        modifier,
        navController = navController
    )
}

@Composable
fun CatalogContent(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Scaffold(
        topBar = {
            Image(
                painter = painterResource(id = R.drawable.ic_molis),
                contentDescription = "Molis Icon",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .height(54.dp)
            )
        },
        modifier = modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Katalog Perpustakaan IT Del", textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(24.dp))
            SearchView()
            Surface(
                shape = MaterialTheme.shapes.extraLarge,
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "KATEGORI", style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold, textAlign = TextAlign.Start
                        )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "BUKU")
                        Text(text = "E-BOOK")
                        Text(text = "JURNAL")
                        Text(text = "NOVEL")
                    }
                    Spacer(modifier = Modifier.height(32.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "BUKU TERBARU")
                        Text(
                            text = "Semua",
                            color = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    NewBook(navController = navController)
                }
            }
        }
    }
}