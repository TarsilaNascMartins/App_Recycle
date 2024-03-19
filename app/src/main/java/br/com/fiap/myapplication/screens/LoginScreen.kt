package br.com.fiap.fase1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.com.fiap.myapplication.R

//LoginScreen(navController: NavController)
@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember {
        mutableStateOf("")
    }
    var senha by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            ,

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painterResource(id = R.drawable.logo ) , contentDescription ="Logo da Marca",
            modifier = Modifier.size(300.dp)
        )
        Text(
            text = "Eco Points",
            fontSize = 25.sp,
            color = Color(0xffDA878F),
            modifier = Modifier.offset(y=(-60).dp),
            fontWeight = FontWeight.SemiBold

        )

        Text(
            text = "Login",
            fontSize = 32.sp,
            color = Color(0xff80A99A),
            fontWeight = FontWeight.Bold

        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            label = { Text(text = "Email", color = Color(0xffDA878F)) },
            placeholder = { Text(text = "Digite Seu email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xffDA878F),
                unfocusedTextColor = Color.Gray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xffDA878F), // Cor da borda quando o campo está em foco
                unfocusedBorderColor = Color.Gray, // Cor da borda quando o campo não está em foco
            ),

            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Icone Pessoa",
                    tint = Color(0xffDA878F)
                )

            }


        )

        OutlinedTextField(
            value = "senha",
            onValueChange = {senha = it},
            label = { Text(text = "Password", color = Color(0xffDA878F)) },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xffDA878F),
                unfocusedTextColor = Color.Gray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xffDA878F), // Cor da borda quando o campo está em foco
                unfocusedBorderColor = Color.Gray, // Cor da borda quando o campo não está em foco
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Icone Pessoa",
                    tint = Color(0xffDA878F)
                )
            },

            )
        Text(
            text = "Esqueceu a senha?",
            textAlign = TextAlign.End,
            fontSize = 14.sp,
            color = Color(0xff80A99A),
            fontWeight = FontWeight.SemiBold
        )


        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(

                onClick = {
                    navController.navigate("home")
                          },
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff80A99A))

            ) {
                Text(text = "Entrar",
                    fontSize = 16.sp
                )
            }


        }

        Text(
            text = "Cadastre-se agora?",
            modifier = Modifier.clickable {
                navController.navigate("cadastro")
            },
            textAlign = TextAlign.End,
            fontSize = 14.sp,
            color = Color(0xff80A99A),
            fontWeight = FontWeight.SemiBold
        )

    }

}




