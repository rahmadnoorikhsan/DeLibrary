package com.rahmadev.delibrary.ui.screen.catalog

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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.ui.component.Header
import com.rahmadev.delibrary.ui.screen.catalog.component.FavoriteBoook
import com.rahmadev.delibrary.ui.screen.catalog.component.NewBook
import com.rahmadev.delibrary.ui.screen.catalog.component.SearchView

@Composable
fun CatalogScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    CatalogContent(
        modifier,
        navController = navController
    )
}

@Composable
fun CatalogContent(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Column(modifier = modifier.fillMaxSize()) {
        Header(showSearch = false, title = "Katalog Perpustakaan IT Del")
        SearchView()
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            item {
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
            item {
                Surface(
                    shape = MaterialTheme.shapes.extraLarge,
                    color = Color.White,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "BUKU TERFAVORITE")
                            Text(
                                text = "Semua",
                                color = Color.Blue
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        FavoriteBoook(navController = navController)
                    }
                }
            }
            item {
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
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "RATING TINGGI")
                            Text(
                                text = "Semua",
                                color = Color.Blue
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        FavoriteBoook(navController = navController)
                    }
                }
            }
            item {
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
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "BUKU TERLARIS")
                            Text(
                                text = "Semua",
                                color = Color.Blue
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        FavoriteBoook(navController = navController)
                    }
                }
            }
        }
    }
}
