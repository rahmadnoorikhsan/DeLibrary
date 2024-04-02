package com.rahmadev.delibrary.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Slider(
    modifier: Modifier = Modifier,
) {
    val title = listOf(
        "Skripsi",
        "Magang/Kerja Praktek",
        "MSIB",
    )
    val description = listOf(
        "Skripsi mahasiswa",
        "Magang MSIB batch 7",
        "MSIB Kampus Merdeka"
    )
    val date = listOf(
        "2 maret 2023",
        "2 maret 2023",
        "2 maret 2023"
    )

    val pagerState = rememberPagerState()

    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        Card(
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(24.dp),
            modifier = modifier.fillMaxWidth()
        ) {
            HorizontalPager(
                state = pagerState,
                count = title.size
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    Text(
                        text = title[it],
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(start = 8.dp, end = 8.dp, bottom = 10.dp)
                    )
                    Text(
                        text = description[it],
                        fontSize = 14.sp,
                        modifier = modifier.padding(start = 8.dp, end = 8.dp, bottom = 10.dp)
                    )
                    Text(
                        text = date[it],
                        fontSize = 14.sp,
                        modifier = modifier.padding(start = 8.dp, end = 8.dp, bottom = 10.dp)
                    )
                }
            }
        }
    }

    LaunchedEffect(pagerState.currentPage) {
        delay(2000)
        var newPosition = pagerState.currentPage + 1
        if (newPosition > title.lastIndex) newPosition = 0
        pagerState.animateScrollToPage(newPosition)
    }
}