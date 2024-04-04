package com.rahmadev.delibrary.ui.login

import android.widget.Toast
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
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.navigation.Screen

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    RegisterContent(modifier, navController)
}

@Composable
fun RegisterContent(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var name by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var nim by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var prodi by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var passwordConfirm by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var passwordVisible by remember { mutableStateOf(false) }
    var passwordConfirmVisible by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column {
        Surface(
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_molis),
                    contentDescription = "Molis Icon",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                        .height(45.dp)
                )
                Spacer(modifier = modifier.height(8.dp))
                Text(
                    text = "Daftar",
                    textDecoration = TextDecoration.Underline,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = Color(0xFF4222EE)
                )
                Spacer(modifier = modifier.height(8.dp))
                Text(text = "Nama")
                Spacer(modifier = modifier.height(6.dp))
                OutlinedTextField(
                    value = name,

                    placeholder = {
                        Text(text = "Masukkan nama lengkap")
                    },
                    onValueChange = { value ->
                        name = value
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1,
                    shape = RoundedCornerShape(16.dp)
                )
                Text(text = "NIM")
                Spacer(modifier = modifier.height(6.dp))
                OutlinedTextField(
                    value = nim,
                    placeholder = {
                        Text(text = "Masukkan nim")
                    },
                    onValueChange = { value ->
                        nim = value
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Done
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1,
                    shape = RoundedCornerShape(16.dp)
                )
                Text(text = "Prodi")
                Spacer(modifier = modifier.height(6.dp))
                OutlinedTextField(
                    value = prodi,
                    placeholder = {
                        Text(text = "Masukkan prodi")
                    },
                    onValueChange = { value ->
                        prodi = value
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1,
                    shape = RoundedCornerShape(16.dp)
                )
                Text(text = "Email")
                Spacer(modifier = modifier.height(6.dp))
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
                Spacer(modifier = modifier.height(8.dp))
                Text(text = "Kata Sandi")
                Spacer(modifier = modifier.height(8.dp))
                OutlinedTextField(
                    value = password,
                    placeholder = {
                        Text(text = "Masukkan kata sandi")
                    },
                    onValueChange = { value ->
                        password = value
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
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
                    maxLines = 1,
                    shape = RoundedCornerShape(16.dp)
                )
                Text(text = " Konfirmasi Kata Sandi")
                Spacer(modifier = modifier.height(6.dp))
                OutlinedTextField(
                    value = passwordConfirm,
                    placeholder = {
                        Text(text = "Masukkan konfirmasi kata sandi")
                    },
                    onValueChange = { value ->
                        passwordConfirm = value
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    visualTransformation = if (passwordConfirmVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image = if (passwordConfirmVisible)
                            Icons.Filled.Visibility
                        else Icons.Filled.VisibilityOff

                        IconButton(onClick = {
                            passwordConfirmVisible = !passwordConfirmVisible
                        }) {
                            Icon(imageVector = image, contentDescription = "")
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 1,
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = modifier.height(8.dp))
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Sudah Punya Akun?")
                    Spacer(modifier = Modifier.width(8.dp))
                    TextButton(onClick = { navController.navigate(Screen.Login.route) }) {
                        Text(
                            text = "Masuk",
                            color = Color.Blue
                        )
                    }
                    Button(
                        onClick = {
                            Toast.makeText(context, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show()
                            navController.navigate(Screen.SuccessRegister.route) },
                        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                    ) {
                        Text(text = "Daftar", fontSize = 15.sp)
                    }
                }
            }
        }
    }
}