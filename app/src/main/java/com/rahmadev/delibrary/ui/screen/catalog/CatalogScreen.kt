package com.rahmadev.delibrary.ui.screen.catalog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CatalogScreen(
    modifier: Modifier = Modifier
) {
    CatalogContent(modifier)
}

@Composable
fun CatalogContent(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(text = "Catalog")
    }
}