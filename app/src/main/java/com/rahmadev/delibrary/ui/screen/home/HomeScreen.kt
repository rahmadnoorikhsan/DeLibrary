package com.rahmadev.delibrary.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.component.Header
import com.rahmadev.delibrary.ui.navigation.Screen
import com.rahmadev.delibrary.ui.screen.home.component.Faculties
import com.rahmadev.delibrary.ui.screen.home.component.Slider

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    HomeContent(
        modifier = modifier,
        onSearchClick = { navController.navigate(Screen.SearchHome.route) }
    )
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    onSearchClick: () -> Unit,
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Header(showSearch = true, title = stringResource(R.string.text_home), onSearchClick = onSearchClick)
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