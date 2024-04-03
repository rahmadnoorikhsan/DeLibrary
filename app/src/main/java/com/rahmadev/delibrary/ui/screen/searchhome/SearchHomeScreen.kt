package com.rahmadev.delibrary.ui.screen.searchhome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.data.ReferencesData
import com.rahmadev.delibrary.model.Reference
import com.rahmadev.delibrary.ui.component.Header
import com.rahmadev.delibrary.ui.screen.searchhome.component.ReferenceItem

@Composable
fun SearchHomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    val focusManager = LocalFocusManager.current
    var query by remember {
        mutableStateOf("")
    }
    val references = ReferencesData.references.filter {
        it.type.contains(query, true)
    }

    SearchHomeContent(
        query = query,
        references = references,
        onBackClick = { navController.navigateUp() },
        onQueryChange = { query = it },
        focusManager = focusManager,
        modifier = modifier
    )
}

@Composable
fun SearchHomeContent(
    query: String,
    references: List<Reference>,
    onBackClick: () -> Unit,
    focusManager: FocusManager,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Header(showSearch = false, title = stringResource(id = R.string.text_home))
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = query,
            onValueChange = onQueryChange,
            shape = MaterialTheme.shapes.small,
            leadingIcon = {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back Button"
                    )
                }
            },
            trailingIcon = {
                if (query.isNotBlank()) {
                    IconButton(onClick = { onQueryChange("") }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Close Icon")
                    }
                }
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
                    onQueryChange(query)
                    focusManager.clearFocus()
                }
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            contentPadding = PaddingValues(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
        ) {
            items(references, { it.id }) {
                ReferenceItem(title = it.title)
            }
        }
    }
}
