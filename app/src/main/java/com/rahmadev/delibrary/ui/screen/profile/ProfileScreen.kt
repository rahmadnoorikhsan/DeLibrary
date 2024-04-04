package com.rahmadev.delibrary.ui.screen.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Person4
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.component.Header
import com.rahmadev.delibrary.ui.navigation.Screen

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    ProfileContent(
        modifier = modifier,
        onLoginClick = { navController.navigate(Screen.Login.route) },
        navController = navController
    )
}

@Composable
fun ButtonLogin(onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Masuk")
    }
}


@Composable
fun Demo_Switch(
    modifier: Modifier = Modifier,
) {
    var switchCheckedState by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = modifier
    ) {
        Switch(
            checked = switchCheckedState,
            onCheckedChange = { switchCheckedState = it },
            modifier = modifier
        )
    }
}

@Composable
fun ProfileContent(
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column {
        Header(showSearch = false, title = stringResource(id = R.string.text_home))
        Spacer(modifier = modifier.height(10.dp))
        Text(
            text = "Selamat Datang, ana",
            color = Color.White,
            textAlign = TextAlign.End,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        Surface(
            color = Color.White,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "PENGATURAN", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Divider(thickness = 3.dp)
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Outlined.Circle, contentDescription = "")
                        Text(text = "Dark Mode")
                    }
                    Demo_Switch(modifier = Modifier)
                }
            }
        }

        Spacer(modifier = Modifier.padding(20   .dp))
        Surface(
            color = Color.White,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "BANTUAN", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                Divider(thickness = 3.dp)
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                    ) {
                        Icon(imageVector = Icons.Default.Person4, contentDescription = "")
                        Text(text = "Kontak Perpustakaan")
                    }
                    Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                    ) {
                        Icon(imageVector = Icons.Default.EditNote, contentDescription = "")
                        Text(text = "Ubah Kata Sandi")
                    }
                    IconButton(onClick = { navController.navigate(Screen.ForgetPassword.route) }) {
                        Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "")
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                    ) {
                        Icon(imageVector = Icons.Default.History, contentDescription = "")
                        Text(text = "Riwayat Peminjaman")
                    }
                    IconButton(onClick = { navController.navigate(Screen.RiwayatPeminjaman.route) }) {
                        Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "")
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
                ButtonLogin {
                    onLoginClick()
                }
            }
        }
    }
}



