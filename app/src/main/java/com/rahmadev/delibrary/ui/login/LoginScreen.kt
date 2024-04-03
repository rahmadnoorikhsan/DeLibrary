package com.rahmadev.delibrary.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.component.Header

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
) {
    LoginContent(modifier)
}

@Composable
fun LoginContent(
    modifier: Modifier = Modifier
) {
    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var passwordVisible by remember { mutableStateOf(false) }

    Column {
        Header(showSearch = false, title = stringResource(id = R.string.text_home), isLogin = true)
        Spacer(modifier = modifier.height(80.dp))
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
                    text = "Masuk",
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
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Done),
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1
                )
                Spacer(modifier = modifier.height(24.dp))
                Text(text = "Kata Sandi")
                Spacer(modifier = modifier.height(16.dp))
                OutlinedTextField(
                    value = password,
                    placeholder = {
                        Text(text = "Masukkan password")
                    },
                    onValueChange = { value ->
                        password = value
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image = if (passwordVisible)
                            Icons.Filled.Visibility
                        else Icons.Filled.VisibilityOff

                        IconButton(onClick = {
                            passwordVisible = !passwordVisible
                        }) {
                            Icon(imageVector = image, contentDescription = "")
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1
                )
                Spacer(modifier = modifier.height(16.dp))
                Text(
                    text = "Lupa Kata Sandi?",
                    modifier = modifier.fillMaxWidth(),
                    textAlign = TextAlign.End
                )
                Spacer(modifier = modifier.height(24.dp))
                Button(
                    onClick = { },
                    modifier = modifier.align(Alignment.End),
                    shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                ) {
                    Text(text = "Masuk", fontSize = 20.sp)

                }
                Spacer(modifier = Modifier.height(84.dp))
                Row {
                    Text(text = "Belum Punya Akun?")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Daftar", fontWeight = FontWeight.Bold, color = Color(0xFF4222EE))
                }
            }
        }
    }

}

@Preview
@Composable
private fun LoginScreen() {

}
