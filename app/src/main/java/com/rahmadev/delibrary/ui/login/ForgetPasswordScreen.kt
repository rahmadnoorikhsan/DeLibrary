package com.rahmadev.delibrary.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.component.Header

@Composable
fun ForgetPasswordScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    ForgetPasswordContent(modifier, navController)
}

@Composable
fun ForgetPasswordContent(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column {
        Header(showSearch = false, title = stringResource(id = R.string.text_home), isLogin = true)
        Spacer(modifier = modifier.height(160.dp))
        Surface(
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                Spacer(modifier = modifier.height(24.dp))
                Text(
                    text = "Lupa Kata Sandi",
                    textDecoration = TextDecoration.Underline,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = Color(0xFF4222EE)
                )
                Spacer(modifier = modifier.height(24.dp))
                Text(text = "Email")
                Spacer(modifier = modifier.height(16.dp))
                OutlinedTextField(
                    value = email,
                    placeholder = {
                        Text(text = "Masukkan email")
                    },
                    onValueChange = { value ->
                        email = value
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Done
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1,
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = modifier.height(24.dp))
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(text = "Kirim", fontSize = 20.sp)
                }
                Spacer(modifier = modifier.height(16.dp))
                Text(
                    text = "Setelah klik Tombol Kirim, Silahkan cek akun email anda.",
                    fontSize = 12.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}