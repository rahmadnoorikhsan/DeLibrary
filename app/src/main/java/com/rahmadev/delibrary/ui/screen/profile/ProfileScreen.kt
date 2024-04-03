package com.rahmadev.delibrary.ui.screen.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Person4
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
        onLoginClick = { navController.navigate(Screen.Login.route) }
    )
}

@Composable
fun ButtonLogin(onClick: () -> Unit) {
    Button(onClick = { onClick() }, modifier = Modifier.fillMaxWidth()) {
        Text("Masuk")
    }
}

@Composable
fun ProfileContent(
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column {
        Header(showSearch = false, title = stringResource(id = R.string.text_home))
        Spacer(modifier = modifier.height(10.dp))
        Text(
            text = "Selamat Datang, ana",
            color = Color.White,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))
        Surface(
            color = Color.White,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(text = "PENGATURAN", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Divider(thickness = 5.dp)
                Row {
                    Icon(imageVector = Icons.Outlined.Circle, contentDescription = "")
                    Text(text = "Dark Mode")
                    Spacer(modifier = Modifier.width(240.dp))
                    Switch(checked = true, onCheckedChange = {
                    })
                }
            }
        }

        Spacer(modifier = Modifier.padding(20.dp))
        Surface(
            color = Color.White,
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(text = "BANTUAN", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Divider(thickness = 3.dp)
                Row {
                    Icon(imageVector = Icons.Default.Person4, contentDescription = "")
                    Text(text = "Kontak Perpustakaan")
                    Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "")
                    Spacer(modifier = Modifier.height(25.dp))
                }
                Row {
                    Icon(imageVector = Icons.Default.EditNote, contentDescription = "")
                    Text(text = "Ubah Kata Sandi")
                    Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "")
                    Spacer(modifier = Modifier.height(50.dp))
                }

                ButtonLogin {
                    onLoginClick()
                }
            }
        }
    }
}



