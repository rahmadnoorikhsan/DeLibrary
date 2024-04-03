package com.rahmadev.delibrary.ui.screen.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.ui.component.Header
import com.rahmadev.delibrary.ui.navigation.Screen
import com.rahmadev.delibrary.ui.screen.catalog.component.FavoriteBook
import com.rahmadev.delibrary.ui.screen.catalog.component.NewBook

@Composable
fun CatalogScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    val focusManager = LocalFocusManager.current
    var query by remember {
        mutableStateOf("")
    }

    CatalogContent(
        modifier = modifier,
        navController = navController,
        query = query,
        focusManager = focusManager,
        onQueryChange = { query = it }
    )
}

@Composable
fun CatalogContent(
    query: String,
    onQueryChange: (String) -> Unit,
    focusManager: FocusManager,
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Column(modifier = modifier.fillMaxSize()) {
        Header(showSearch = false, title = "Katalog Perpustakaan IT Del")
        TextField(
            value = query,
            onValueChange = { onQueryChange(it) },
            shape = MaterialTheme.shapes.medium,
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Close Icon")
                }
            },
            placeholder = {
                Text(text = "Cari", textAlign = TextAlign.End, modifier = Modifier.fillMaxWidth())
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                disabledTextColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    focusManager.clearFocus()
                }
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
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
                            .padding(vertical = 16.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            text = "KATEGORI",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold, textAlign = TextAlign.Start
                            )
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "SEMUA")
                            Text(text = "BUKU")
                            Text(text = "E-BOOK")
                            Text(text = "JURNAL")
                            Text(text = "NOVEL")
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "BUKU TERBARU", fontWeight = FontWeight.Bold)
                            TextButton(onClick = { navController.navigate(Screen.ListBook.route) }) {
                                Text(
                                    text = "Semua",
                                    color = Color.Blue,
                                    fontWeight = FontWeight.Bold
                                )
                            }
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
                            .padding(top = 8.dp, bottom = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "BUKU TERFAVORITE",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold, textAlign = TextAlign.Start
                                )
                            )
                            TextButton(onClick = { navController.navigate(Screen.ListBook.route) }) {
                                Text(
                                    text = "Semua",
                                    color = Color.Blue,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        FavoriteBook(navController = navController)
                    }
                }
            }
        }
    }
}
