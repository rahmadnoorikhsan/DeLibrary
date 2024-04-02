package com.rahmadev.delibrary.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.screen.home.component.Faculties
import com.rahmadev.delibrary.ui.screen.home.component.Slider
import com.rahmadev.delibrary.ui.theme.DeLibraryTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    HomeContent(modifier)
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
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
        Column(
            modifier = modifier
                .padding(it)
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Memudahkan pinjam Referensi di perpustakaan IT Del",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(0.6f)
                )
                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 24.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon",
                        tint = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Slider(modifier = Modifier.padding(horizontal = 8.dp))
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
                        text = "FAKULTAS", style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Faculties()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    DeLibraryTheme {
        HomeScreen()
    }
}
