package com.rahmadev.delibrary.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rahmadev.delibrary.R

@Composable
fun RiwayatPeminjaman() {
    RiwayatPeminjamanContent()
}

@Composable
fun RiwayatPeminjamanContent(
    modifier: Modifier = Modifier
) {
    Column {
        Surface(
            shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(185.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.buku5),
                        contentDescription = "Foto Mahasiswa",
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(150.dp), contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text(text = "Nama: Ana Sitorus")
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "NIM: 11420002")
                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Surface(
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
            modifier = Modifier
                .fillMaxSize()

        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Column {
                Text(
                    text = "Riwayat Peminjaman",
                    fontSize = 24.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    textDecoration = TextDecoration.Underline
                )

                Card (
                    modifier = Modifier.padding(8.dp)
                ) {
                    Row(
                    ) {
                        Box(
                            modifier = Modifier
                                .width(150.dp)
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.buku2),
                                contentDescription = "Buku",
                                modifier = Modifier
                                    .clip(RectangleShape)
                                    .size(150.dp), contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column(
                            modifier = Modifier.height(150.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "ID Buku: 2351")
                            Text(text = "Judul Buku: AI For Future")
                            Text(text = "Lokasi Buku: LT.1")
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Perpanjang",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color.Blue,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                    }
                }
                Card (
                    modifier = Modifier.padding(8.dp)
                ) {
                    Row(
                    ) {
                        Box(
                            modifier = Modifier
                                .width(150.dp)
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.buku4),
                                contentDescription = "Buku",
                                modifier = Modifier
                                    .clip(RectangleShape)
                                    .size(150.dp), contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column(
                            modifier = Modifier.height(150.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "ID Buku: 2352")
                            Text(text = "Judul Buku: Machine Learning")
                            Text(text = "Lokasi Buku: LT.1")
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Perpanjang",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color.Blue,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                    }
                }
                Card (
                    modifier = Modifier.padding(8.dp)
                ) {
                    Row(
                    ) {
                        Box(
                            modifier = Modifier
                                .width(150.dp)
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.buku5),
                                contentDescription = "Buku",
                                modifier = Modifier
                                    .clip(RectangleShape)
                                    .size(150.dp), contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column(
                            modifier = Modifier.height(150.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "ID Buku: 2352")
                            Text(text = "Judul Buku: Software Engineering for Build")
                            Text(text = "Lokasi Buku: LT.2")
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Bayar Denda",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                    }
                }
            }


        }
    }
}