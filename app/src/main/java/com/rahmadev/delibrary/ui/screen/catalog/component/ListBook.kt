package com.rahmadev.delibrary.ui.screen.catalog.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.data.FacultiesData
import com.rahmadev.delibrary.ui.component.Header
import com.rahmadev.delibrary.ui.navigation.Screen

@Composable
fun ListBook(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    val newBook = FacultiesData.books
    val focusManager = LocalFocusManager.current
    var query by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        Header(showSearch = false, title = stringResource(id = R.string.text_home))
        TextField(
            value = query,
            onValueChange = { query = it },
            shape = MaterialTheme.shapes.medium,
            leadingIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back Button"
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = { }) {
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
        Spacer(modifier = Modifier.height(24.dp))
        Surface(
            shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp),
            color = Color.White,
            modifier = modifier.fillMaxSize()
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 24.dp),
                modifier = modifier
                    .fillMaxSize()
            ) {
                items(newBook, { it.id }) {
                    FolderItemNewBook(newBook = it) { bookId ->
                        navController.navigate(Screen.DetailCatalog.route + "/$bookId")
                    }
                }
            }
        }
    }
}