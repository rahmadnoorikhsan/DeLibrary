package com.rahmadev.delibrary.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.navigation.Screen

@Composable
fun SuccessRegisterScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    SuccessRegisterContent(modifier, navController)
}

@Composable
fun SuccessRegisterContent(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column {
        Surface(
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_molis),
                    contentDescription = "Molis Icon",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp)
                        .height(54.dp)
                )
                Text(text = "Buat Akun Berhasi!!", fontSize = 32.sp, color = Color.Green)
                Spacer(modifier = modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "Sudah Punya Akun?")
                    Spacer(modifier = Modifier.width(8.dp))
                    TextButton(onClick = { navController.navigate(Screen.Login.route) }) {
                        Text(
                            text = "Masuk",
                            color = Color.Blue
                        )
                    }
                }
            }
        }
    }
}