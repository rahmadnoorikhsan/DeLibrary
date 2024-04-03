package com.rahmadev.delibrary.ui.screen.catalog.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchView(
    modifier: Modifier = Modifier
) {
    val textState = remember {
        mutableStateOf(TextFieldValue(""))
    }
    SearchViewContent(state = textState, placeHolder = "Cari", modifier = modifier.padding(start = 12.dp, end = 12.dp))
}

@Composable
fun SearchViewContent(
    state: MutableState<TextFieldValue>,
    placeHolder: String,
    modifier: Modifier
) {
    TextField(
        value = state.value,
        onValueChange = { value ->
            state.value = value
        },
        modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .clip(RoundedCornerShape(30.dp))
            .border(2.dp, Color.LightGray, RoundedCornerShape(30.dp)),
        placeholder = {
            Text(text = placeHolder, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.End)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.White,
        ),
        shape = MaterialTheme.shapes.small,
        maxLines = 1,
        singleLine = true,
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 20.sp
        )
    )
}